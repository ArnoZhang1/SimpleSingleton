package com.arno.simpleSingleton;

/**
 * Created by arnozhang on 2020/2/29.
 **/
public class ExectorThread implements Runnable
{
    public void run() {
        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+lazySimpleSingleton.toString());
    }
}
