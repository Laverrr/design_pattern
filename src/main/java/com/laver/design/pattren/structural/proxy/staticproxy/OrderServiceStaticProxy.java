package com.laver.design.pattren.structural.proxy.staticproxy;

import com.laver.design.pattren.structural.proxy.IOrderService;
import com.laver.design.pattren.structural.proxy.Order;
import com.laver.design.pattren.structural.proxy.OrderServiceImpl;
import com.laver.design.pattren.structural.proxy.db.DataSourceContextHolder;

public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    public int saveOrder(Order order){
        beforeMethod(order);
        iOrderService = new OrderServiceImpl();
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }

    private void beforeMethod(Order order){
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db"+dbRouter+"】处理数据");

        DataSourceContextHolder.setDBtype("db"+String.valueOf(dbRouter));
        System.out.println("静态代理 before code");
    }
    private void afterMethod(){
        System.out.println("静态代理 after code");
    }

}
