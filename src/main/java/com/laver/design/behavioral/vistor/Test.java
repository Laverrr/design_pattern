package com.laver.design.behavioral.vistor;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Course> courseList = new ArrayList<>();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("SpringMVC");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("Java");
        codingCourse.setPrice(133);

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        for (Course course : courseList) {
            course.accept(new Visitor());
        }
    }
}
