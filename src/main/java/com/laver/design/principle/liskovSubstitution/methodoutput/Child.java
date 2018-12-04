package com.laver.design.principle.liskovSubstitution.methodoutput;

import java.util.HashMap;
import java.util.Map;

public class Child extends Base {

    @Override
    public HashMap method() {
        HashMap hashMap = new HashMap();
        System.out.println("son method execute");
        hashMap.put("msg","son method execute");
        return hashMap;
    }
}
