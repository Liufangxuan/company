package com.gy.login.controller;

import com.gy.user.model.User;
import com.gy.user.model.UserExample;
import com.gy.user.service.UserService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class LoginController {
    private UserService userService;

    @Autowired
    public LoginController(UserService userService) {
        this.userService = userService;
    }
    //处理登录
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Object login(@RequestBody User user, HttpServletResponse response) {
// 获取用户名和密码
        String loginId = user.getLoginId();
        String password = user.getCurrentPassword();
// 从数据库中获取用户名和密码后进行判断
        if (loginId != null && password != null) {
            UserExample example =new UserExample();
            UserExample.Criteria criteria = example.createCriteria();
            criteria.andLoginIdEqualTo(loginId);
            criteria.andCurrentPasswordEqualTo(password);
            List<User> list = userService.selectByExample(example);
//根据给定的用户名和密码查询
//如果有结果，证明用户名和密码正确
            if (list.size() > 0) {
//返回用户信息
                User u =list.get(0);
                return u;
            }
        }
//登录失败，在前端登录用这个代码判断是否成功
        response.setStatus(500);
        return "err500";
    }
}
