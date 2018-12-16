package com.laver.design.behavioral.interpreter;

public class MultiInterpreter implements Interpreter {

    private Interpreter firstExpression,secondExpression;

    public MultiInterpreter(Interpreter firstExpression, Interpreter secondExpression){
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpreter() {
        return this.firstExpression.interpreter()*this.secondExpression.interpreter();
    }

    @Override
    public String toString() {
        return "*";
    }
}
