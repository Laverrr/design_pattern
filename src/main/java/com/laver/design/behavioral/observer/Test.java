package com.laver.design.behavioral.observer;

public class Test {
    public static void main(String[] args) {
        Course course = new Course("Java design pattern");
        Teacher teacher1 = new Teacher("Geely1");
        Teacher teacher2 = new Teacher("Geely2");
        course.addObserver(teacher1);
        course.addObserver(teacher2);

        Question question = new Question();
        question.setUserName("Laver");
        question.setQuestionContent("how to write main function");
        course.produceQuestion(course,question);
    }
}
