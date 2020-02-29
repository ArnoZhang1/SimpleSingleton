package com.arno.simpleSingleton;

import java.io.Serializable;

/**
 * Created by arnozhang on 2020/2/29.
 **/
//反序列化导致破坏单例模式
public class SeriableSingleton implements Serializable {

    public final static SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton() {
    }

    public static SeriableSingleton getInstance() {
        return INSTANCE;
    }
    private Object readResolve(){
        return INSTANCE; }
}