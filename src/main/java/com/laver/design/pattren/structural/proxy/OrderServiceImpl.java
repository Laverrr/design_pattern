package com.laver.design.pattren.structural.proxy;

public class OrderServiceImpl implements IOrderService {

    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        //Spring auto Inject, here new Object
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
        return iOrderDao.insert(order);
    }
}
