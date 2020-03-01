package com.arno.prototypepattern;

import com.google.gson.Gson;

/**
 * Created by arnozhang on 2020/3/1.
 **/
public class DeepCloneTest {

    public static void main(String[] args) {
        String jsonStr="{\"item\":{\"name\":\"姓名\"},\"id\":\"ID\"}";
        Pojo result = new Gson().fromJson(jsonStr, Pojo.class);
        System.out.println(result);
        try {
            Object copyResult = result.clone();
            System.out.println(copyResult);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }

}
