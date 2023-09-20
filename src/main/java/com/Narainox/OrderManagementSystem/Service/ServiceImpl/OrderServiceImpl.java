package com.Narainox.OrderManagementSystem.Service.ServiceImpl;

import com.Narainox.OrderManagementSystem.Exception.OrderException;
import com.Narainox.OrderManagementSystem.Model.Order;
import com.Narainox.OrderManagementSystem.Repository.OrderDAO;
import com.Narainox.OrderManagementSystem.Service.OrderService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    OrderDAO orderDAO;

    public OrderServiceImpl(OrderDAO orderDAO) {
        super();
        this.orderDAO = orderDAO;
    }

    @Override
    public Order addOrder(Order order) {
        Order save = orderDAO.save(order);
        return save;
    }

    @Override
    public Order removeOrder(Integer orderId) {
        Optional<Order> order=orderDAO.findById(orderId);
        if (order.isPresent()) {
            Order order1 = order.get();
            return order1;
        }
        else {
            throw new OrderException("Order Not Found With OrderId: "+orderId);
        }
    }

    @Override
    public Order viewOrder(Integer orderId) {
        Optional<Order> order=orderDAO.findById(orderId);
        if (order.isPresent()) {
            Order order1 = order.get();
            orderDAO.delete(order.get());
            return order1;
        }
        else {
            throw new OrderException("Order Not Found With OrderId: "+orderId);
        }
    }
}
