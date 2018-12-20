package com.laver.design.behavioral.state;

public class StopState extends CourseVideoState  {

    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    public void speed() {
        System.out.println("error,cant speed");
    }

    @Override
    public void pause() {
        System.out.println("error,cant pause");
    }

    @Override
    public void stop() {
        System.out.println("stop video state");
    }
}
