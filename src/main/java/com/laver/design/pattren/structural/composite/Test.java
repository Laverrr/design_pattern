package com.laver.design.pattren.structural.composite;

public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux Course",11);
        CatalogComponent windowsCourse = new Course("Windows Course",11);

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java Course catalog",2);

        CatalogComponent mmallCourse1 = new Course("mmall 1",55);
        CatalogComponent mmallCourse2 = new Course("mmall 1",55);
        CatalogComponent designPattern = new Course("java design-pattern",77);

        javaCourseCatalog.add(mmallCourse1);
        javaCourseCatalog.add(mmallCourse2);
        javaCourseCatalog.add(designPattern);

        CatalogComponent imoocMainCourseCatalog = new CourseCatalog("imooc main Course catalog",1);
        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowsCourse);
        imoocMainCourseCatalog.add(javaCourseCatalog);

        imoocMainCourseCatalog.print();



    }
}
