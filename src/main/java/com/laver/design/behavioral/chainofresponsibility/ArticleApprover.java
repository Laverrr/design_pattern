package com.laver.design.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

public class ArticleApprover extends  Approver {
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getArticle())){
            System.out.println(course.getName()+"has article.Approved");
            if (approver != null){
                approver.deploy(course);
            }
        }else {
            System.out.println(course.getName()+"does not have article.Do not approve");
            return;
        }

    }
}
