package com.laver.design.pattren.structural.decorator.v2;

public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "cake";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
