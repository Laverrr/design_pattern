package com.laver.design.pattren.behavioral.templatemethod;

public abstract class ACourse {
    protected final void makeCourse(){
        this.makePPT();
        this.makeVideo();
        //钩子方法
        if (needWriteArticle()){
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT(){
        System.out.println("make PPT");
    }
    final void makeVideo(){
        System.out.println("make video");
    }
    final void writeArticle(){
        System.out.println("write article");
    }
    //钩子方法
    protected boolean needWriteArticle(){
        return false;
    }

    abstract void packageCourse();
}
