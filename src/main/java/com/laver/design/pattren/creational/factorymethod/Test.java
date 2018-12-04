package com.laver.design.pattren.creational.factorymethod;

public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        VideoFactory videoFactory2 = new FEVideoFactory();
        VideoFactory videoFactory3 = new PythonVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
