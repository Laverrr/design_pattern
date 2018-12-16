package com.laver.design.behavioral.strategy;

import org.apache.commons.lang3.StringUtils;

public class Test {
//    public static void main(String[] args) {
//        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
//        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());
//
//        promotionActivity618.executePromotionStrategy();
//        promotionActivity1111.executePromotionStrategy();
//    }
//public static void main(String[] args) {
//    PromotionActivity promotionActivity = null;
//
//    String promotionKey = "LiJian";
//
//    if (StringUtils.equals(promotionKey,"LiJian")){
//        promotionActivity = new PromotionActivity(new LiJianPromotionStrategy());
//    }else if (StringUtils.equals(promotionKey,"ManJian")){
//        promotionActivity = new PromotionActivity(new ManJianPromotionStrategy());
//    }//....
//    promotionActivity.executePromotionStrategy();
//}

    public static void main(String[] args) {

        String promotionKey = "LIJIAN";

        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getProtionStrategy(promotionKey));
        promotionActivity.executePromotionStrategy();
    }
}
