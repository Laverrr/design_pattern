package com.laver.design.principle.dependenceinversion;

public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("Laver is learning java course");
    }
}
