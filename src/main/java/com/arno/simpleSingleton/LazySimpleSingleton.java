package com.arno.simpleSingleton;

/**
 * Created by arnozhang on 2020/2/29.
 **/
public class LazySimpleSingleton {

    //饿汉式
    private LazySimpleSingleton() {
    }

    private static LazySimpleSingleton lazy = null;

    public static LazySimpleSingleton getInstance() {
        if (lazy == null) {
            synchronized(LazySimpleSingleton.class){
                if (lazy==null){
                    lazy = new LazySimpleSingleton();
                }
            }
        }
        return lazy;
    }
}
