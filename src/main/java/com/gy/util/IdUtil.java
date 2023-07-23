package com.gy.util;

public class IdUtil {
    private static int last = 0;
    //生成9位随机的整型数字id
    public static Integer nextId9(){
        int LIMIT = 1000000000;
        int id = (int)(System.currentTimeMillis() % LIMIT);
        if ( id <= last ) {
            id = (last + 1) ;
        }
        return last = id;
    }
}
