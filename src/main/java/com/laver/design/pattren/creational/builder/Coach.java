package com.laver.design.pattren.creational.builder;

public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName,String coursePPT,String courseVideo,String courseArticle,String courseQA){
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildPPT(coursePPT);
        this.courseBuilder.buildVideo(courseVideo);
        this.courseBuilder.buildArticle(courseArticle);
        this.courseBuilder.buildCourseQA(courseQA);
        return this.courseBuilder.makeCourse();
    }
}
