package com.laver.design.pattren.creational.builder;

public class CourseActualBuilder extends CourseBuilder {

    private Course course = new Course();

    @Override
    public void buildCourseName(String courseName) {
        course.setCourseName(courseName);
    }

    @Override
    public void buildPPT(String coursePPT) {
        course.setCoursePPT(coursePPT);
    }

    @Override
    public void buildVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    @Override
    public void buildArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    @Override
    public void buildCourseQA(String courseQA) {
        course.setCourseQA(courseQA);
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
