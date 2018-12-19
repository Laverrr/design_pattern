package com.laver.design.behavioral.chainofresponsibility;

public class Test {
    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("Java");
        course.setArticle("Java article");
        course.setVideo("Java video");

        articleApprover.setNextApprover(videoApprover);

        articleApprover.deploy(course);
    }
}
