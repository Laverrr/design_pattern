package com.laver.design.pattren.creational.builder;

public class Test {
    public static void main(String[] args) {
        CourseActualBuilder courseActualBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseActualBuilder);

        Course course = coach.makeCourse("java", "java PPT", "java video", "java article", "java Q&A");

        System.out.println(course);

    }
}
