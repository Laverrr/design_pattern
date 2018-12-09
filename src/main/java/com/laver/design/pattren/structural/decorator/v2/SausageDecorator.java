package com.laver.design.pattren.structural.decorator.v2;

public class SausageDecorator extends AbstractDecorator{
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " add sausage";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
