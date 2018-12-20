package com.laver.design.behavioral.state;

public class PauseState extends CourseVideoState  {

    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);

    }

    @Override
    public void pause() {
        System.out.println("pause video state");

    }

    @Override
    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
