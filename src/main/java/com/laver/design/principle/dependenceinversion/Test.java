package com.laver.design.principle.dependenceinversion;

public class Test {
    public static void main(String[] args) {
//        v1
//        Laver laver = new Laver();
//        laver.studyFECourse();
//        laver.studyJavaCourse();
//        v2
//        Laver laver = new Laver();
//        laver.studyImoocCourse(new JavaCourse());
//        laver.studyImoocCourse(new FECourse());
//        laver.studyImoocCourse(new PythonCourse());

//        v3
//        Laver laver = new Laver(new JavaCourse());
//        laver.studyImoocCourse();

        Laver laver = new Laver();
        laver.setiCourse(new JavaCourse());
        laver.studyImoocCourse();
        laver.setiCourse(new PythonCourse());
        laver.studyImoocCourse();
    }
}
