package com.arno.simpleSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by arnozhang on 2020/2/29.
 **/
public class Test {
    //    public static void main(String[] args) {
//        Thread thread1 = new Thread(new ExectorThread());
//        Thread thread2 = new Thread(new ExectorThread());
//        thread1.start();
//        thread2.start();
//        System.out.println("-end-");
//    }
    public static void main(String[] args) {

        Class<?> clazz = LazyInnerClassSingleton.class;
        try {
            Constructor c=    clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            Object obj1 = c.newInstance();
            Object obj2 = c.newInstance();
            System.out.println(obj1==obj2);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }


}
