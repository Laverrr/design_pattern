package com.laver.design.principle.singleresponsibility;

public class Test {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.mainMoveMode("Big Dick");
        bird.mainMoveMode("鸵鸟");

        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("Big Dick");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}
