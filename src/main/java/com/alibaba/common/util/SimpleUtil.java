package com.alibaba.common.util;

import java.util.UUID;

public class SimpleUtil {
    public static String uuid(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
