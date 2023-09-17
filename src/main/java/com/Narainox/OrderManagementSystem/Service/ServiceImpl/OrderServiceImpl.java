package com.Narainox.OrderManagementSystem.Service.ServiceImpl;

import com.Narainox.OrderManagementSystem.Repository.OrderDAO;
import com.Narainox.OrderManagementSystem.Repository.ProductDAO;
import com.Narainox.OrderManagementSystem.Service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    OrderDAO orderDAO;

    public OrderServiceImpl(OrderDAO orderDAO) {
        super();
        this.orderDAO = orderDAO;
    }
}
