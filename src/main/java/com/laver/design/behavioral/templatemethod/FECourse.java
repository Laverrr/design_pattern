package com.laver.design.behavioral.templatemethod;

public class FECourse extends ACourse {
    private boolean needWriteArticleFlag = false;

    @Override
    void packageCourse() {
        System.out.println("provide source code");
        System.out.println("provide digital resource");
    }

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }
}
