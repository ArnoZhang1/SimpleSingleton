package com.arno.simpleSingleton;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by arnozhang on 2020/2/29.
 **/
public class ContainerSingleton {
    private ContainerSingleton() {
    }

    private static Map<String, Object> container = new Hashtable<String, Object>();

    public static void put(String key, Object value) {
        if (key != null && container.containsKey(key) && null != value) {
            if (null != container.get(key)) {
                container.put(key,value);
            }
        }
    }
    public static Object getIntance(String key){
        return container.get(key);
    }
}
