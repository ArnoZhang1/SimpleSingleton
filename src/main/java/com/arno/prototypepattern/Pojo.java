package com.arno.prototypepattern;

/**
 * Created by arnozhang on 2020/3/1.
 **/
public class Pojo implements Cloneable {
    private Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    String id;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pojo result = (Pojo) super.clone();
        if (null != item) {
            result.setItem((Item) item.clone());
        }
        return result;
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "item=" + item +
                ", id='" + id + '\'' +
                '}';
    }
}
