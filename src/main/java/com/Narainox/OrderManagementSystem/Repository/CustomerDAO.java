package com.Narainox.OrderManagementSystem.Repository;

import com.Narainox.OrderManagementSystem.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDAO extends JpaRepository<Customer,Integer> {
}
