package com.laver.design.behavioral.templatemethod;

public class Test {
    public static void main(String[] args) {
        System.out.println("backend design pattern course start---");
        ACourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("backend design pattern course end---");

        System.out.println("FE course start---");
        ACourse feCourse = new FECourse(true);
        feCourse.makeCourse();
        System.out.println("FE course end---");
    }
}
