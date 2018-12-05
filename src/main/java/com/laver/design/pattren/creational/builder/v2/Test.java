package com.laver.design.pattren.creational.builder.v2;

import jdk.nashorn.internal.ir.annotations.Immutable;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("java").buildPPT("java PPT").buildVideo("java video").build();
        System.out.println(course);

    }
}
