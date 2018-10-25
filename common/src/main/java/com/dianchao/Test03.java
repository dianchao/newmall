package com.dianchao;

import java.lang.reflect.Field;

public class Test03 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String s = " a b ";
        Class clazz = String.class;
        Field field = clazz.getDeclaredField("value");
        field.setAccessible(true);

        char[] chars = (char [])field.get(s);
        chars[2] = '1';

        s.trim();
        System.out.println("--" + s + "--");
    }
}
