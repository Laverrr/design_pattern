package com.laver.design.pattren.creational.abstractfactory;

public class Test {
    public static void main(String[] args) {
        CourseFactory javaFactory = new JavaCourseFactory();
        Video javaVideo = javaFactory.getVideo();
        Article javaArticle = javaFactory.getArticle();
        javaVideo.produce();
        javaArticle.produce();
    }


}
