package com.laver.design.behavioral.strategy;

public class FanXianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返现的金额存放到用户余额中");
    }
}
