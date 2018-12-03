package com.laver.design.principle.dependenceinversion;

public class FECourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("Laver is learning FE course");
    }
}
