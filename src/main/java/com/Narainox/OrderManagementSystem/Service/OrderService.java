package com.Narainox.OrderManagementSystem.Service;

import com.Narainox.OrderManagementSystem.Model.Order;

public interface OrderService {
    public Order addOrder(Order order);

    public Order removeOrder(Integer orderId);

    public Order viewOrder(Integer orderId);

}
