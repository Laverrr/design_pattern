package com.laver.design.principle.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96, "java入门到放弃", 348d);
        JavaDiscountCourse javaCourse=(JavaDiscountCourse)iCourse;
        System.out.println("课程ID:"+javaCourse.getId()+" 课程名称:"+javaCourse.getName()+" 原价"+javaCourse.getOriginPrice()+" 折后价格:"+javaCourse.getPrice()+"元");
    }
}
