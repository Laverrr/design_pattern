package com.laver.design.principle.demeter;

import java.util.ArrayList;

public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }
}
