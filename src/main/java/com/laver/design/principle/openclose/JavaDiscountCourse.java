package com.laver.design.principle.openclose;

public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice(){
        return super.getPrice()*0.8;
    }

}
