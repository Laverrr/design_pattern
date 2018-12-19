package com.laver.design.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

public class VideoApprover extends  Approver {
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getVideo())){
            System.out.println(course.getName()+"has video.Approved");
            if (approver != null){
                approver.deploy(course);
            }
        }else {
            System.out.println(course.getName()+"does not have video.Do not approve");
            return;
        }

    }
}
