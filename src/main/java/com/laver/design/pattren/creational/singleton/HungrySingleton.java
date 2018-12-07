package com.laver.design.pattren.creational.singleton;

import java.io.Serializable;

public class HungrySingleton implements Serializable,Cloneable {
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }

    private HungrySingleton(){
        if (hungrySingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    private Object readResolve(){
        return hungrySingleton;
    }
}
