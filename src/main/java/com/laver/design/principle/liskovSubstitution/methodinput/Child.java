package com.laver.design.principle.liskovSubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;

public class Child extends Base {

    @Override
    public void method(HashMap map) {
        System.out.println("param HashMap son execute");
    }

    public void method(Map map) {
        System.out.println("param Map son execute");
    }
}
