package com.laver.design.behavioral.iterator;

public class Test {

    public static void main(String[] args) {
        Course course1 = new Course("mmall1 ");
        Course course2 = new Course("mmall2 ");
        Course course3 = new Course("design pattern ");
        Course course4 = new Course("python ");
        Course course5 = new Course("FE Course ");
        Course course6 = new Course("BE Course ");

        CourseAggregate courseAggregate = new CourseAggregateImpl();
        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
        courseAggregate.addCourse(course3);
        courseAggregate.addCourse(course4);
        courseAggregate.addCourse(course5);
        courseAggregate.addCourse(course6);

        System.out.println("----course list----");
        printCourses(courseAggregate);

        courseAggregate.removeCourse(course4);
        courseAggregate.removeCourse(course5);

        System.out.println("---after remove course list----");
        printCourses(courseAggregate);
    }

    public static void printCourses(CourseAggregate courseAggregate){
        CourseIterator courseIterator = courseAggregate.getCourseIterator();
        while (!courseIterator.isLastCourse()){
            Course course = courseIterator.nextCourse();
            System.out.println(course.getName());
        }
    }
}
