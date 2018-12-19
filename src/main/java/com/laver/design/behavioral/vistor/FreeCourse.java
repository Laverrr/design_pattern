package com.laver.design.behavioral.vistor;

public class FreeCourse extends Course {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
