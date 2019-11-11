package com.stopboot.admin.utils;

/**
 * @version:0.1
 * @author: Lianyutao
 * @create: 2019/11/11
 * @description: StringUtil
 **/
public class StringUtil {

    /**
     * 首字母大写
     * @param name
     * @return
     */
    public static String captureName(String name) {
        char[] cs=name.toCharArray();
        cs[0]-=32;
        return String.valueOf(cs);

    }
}
