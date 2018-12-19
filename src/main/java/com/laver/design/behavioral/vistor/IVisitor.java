package com.laver.design.behavioral.vistor;

public interface IVisitor {

    void visit(FreeCourse freeCourse);

    void visit(CodingCourse codingCourse);
}
