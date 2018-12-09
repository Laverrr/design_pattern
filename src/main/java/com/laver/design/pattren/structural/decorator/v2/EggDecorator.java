package com.laver.design.pattren.structural.decorator.v2;

public class EggDecorator extends AbstractDecorator {
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " add egg";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
