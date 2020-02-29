package com.arno.simpleSingleton;

import java.io.*;

/**
 * Created by arnozhang on 2020/2/29.
 **/
public class SeriableSingletonTest {
    public static void main(String[] args) {
        SeriableSingleton singleton = SeriableSingleton.INSTANCE;
        SeriableSingleton singleton2 = null;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(singleton2);
            oos.flush();
            oos.close();
            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            singleton = (SeriableSingleton) ois.readObject();
            ois.close();
            System.out.println(singleton);
            System.out.println(singleton2);
            System.out.println(singleton == singleton2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
