package com.laver.design.pattren.structural.proxy.dynamicproxy;

import com.laver.design.pattren.structural.proxy.IOrderService;
import com.laver.design.pattren.structural.proxy.Order;
import com.laver.design.pattren.structural.proxy.OrderServiceImpl;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderServiceDynamicProxy.saveOrder(order);
    }
}
