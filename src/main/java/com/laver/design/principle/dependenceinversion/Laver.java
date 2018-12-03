package com.laver.design.principle.dependenceinversion;

public class Laver {

    private ICourse iCourse;

    public void studyImoocCourse(){
        iCourse.studyCourse();
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
}
