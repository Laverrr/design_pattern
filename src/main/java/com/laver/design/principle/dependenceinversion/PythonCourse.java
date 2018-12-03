package com.laver.design.principle.dependenceinversion;

public class PythonCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("Laver is learning Python course");
    }
}
