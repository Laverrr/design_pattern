package com.laver.design.behavioral.vistor;

public class Visitor implements IVisitor {
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("free course:"+freeCourse.getName());
    }

    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("free course:"+codingCourse.getName()+"price:"+codingCourse.getPrice());
    }
}
