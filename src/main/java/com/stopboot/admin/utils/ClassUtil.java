package com.stopboot.admin.utils;

import java.lang.reflect.ParameterizedType;

/**
 * @description:
 * @author: Lianyutao
 * @create: 2019-10-15 13:43
 * @version:
 **/

public class ClassUtil {

    /**
     * 根据索引获取泛型参数的这是类型
     * @param clazz
     * @param index
     * @return
     */
    public static Class<?> getClass(Class clazz, Integer index) {
        return (Class<?>) ((ParameterizedType) clazz.getGenericSuperclass()).getActualTypeArguments()[index];
    }
}
