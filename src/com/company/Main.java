package com.company;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Object obj = new Exercise();
        for (int i = 1; i <= obj.getClass().getDeclaredMethods().length; i++) {
            obj.getClass().getDeclaredMethod("ex" + i).invoke(obj);
        }
    }
}
