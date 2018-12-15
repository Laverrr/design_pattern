package com.laver.design.pattren.behavioral.templatemethod;

public class DesignPatternCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("provide java source code");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
