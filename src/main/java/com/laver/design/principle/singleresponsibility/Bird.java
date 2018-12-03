package com.laver.design.principle.singleresponsibility;

public class Bird {

    public void mainMoveMode(String birdName){
        if ("鸵鸟".equals(birdName)){
            System.out.println(birdName+"move with leg ");
        }else {
            System.out.println(birdName+"fly with wings ");
        }
    }
}
