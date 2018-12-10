package com.laver.design.pattren.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {
    private static final Map<String,Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String department){
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if (manager == null){
            manager = new Manager(department);
            String reportContent = department+"report:content is xxx";
            System.out.print(" 创建部门经理: "+department);
            manager.setReportContent(reportContent);
            System.out.println(" 创建报告: "+reportContent);
            EMPLOYEE_MAP.put(department,manager);
        }
        return manager;
    }
}
