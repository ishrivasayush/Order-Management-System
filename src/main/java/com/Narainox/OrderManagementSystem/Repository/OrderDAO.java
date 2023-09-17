package com.Narainox.OrderManagementSystem.Repository;

import com.Narainox.OrderManagementSystem.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDAO extends JpaRepository<Order,Integer> {

}
