package com.laver.design.behavioral.command;

public class CourseVideo {
    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open(){
        System.out.println(this.name+"course open");
    }
    public void close(){
        System.out.println(this.name+"course close");
    }


}
