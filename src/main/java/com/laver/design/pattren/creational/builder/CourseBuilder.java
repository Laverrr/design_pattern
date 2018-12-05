package com.laver.design.pattren.creational.builder;

public abstract class CourseBuilder {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;

    //question & answer
    private String courseQA;

    public abstract void buildCourseName(String courseName);
    public abstract void buildPPT(String coursePPT);
    public abstract void buildVideo(String courseVideo);
    public abstract void buildArticle(String courseArticle);
    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}
