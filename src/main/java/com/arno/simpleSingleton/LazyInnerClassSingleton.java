package com.arno.simpleSingleton;

/**
 * Created by arnozhang on 2020/2/29.
 **/
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton() {
        if (null==InnerClass.LAZY){
            throw new RuntimeException("不允许有多个实例，请勿使用反射破坏单例");
        }
    }

   public static final LazyInnerClassSingleton getIntance() {
        return InnerClass.LAZY;
    }

    private static class InnerClass {
        static LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
