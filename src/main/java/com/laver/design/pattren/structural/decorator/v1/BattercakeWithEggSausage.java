package com.laver.design.pattren.structural.decorator.v1;

public class BattercakeWithEggSausage extends BattercakeWithEgg {
    @Override
    public String getDesc() {
        return super.getDesc()+" with sausage";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
