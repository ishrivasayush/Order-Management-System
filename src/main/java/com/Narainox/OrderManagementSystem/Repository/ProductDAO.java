package com.Narainox.OrderManagementSystem.Repository;


import com.Narainox.OrderManagementSystem.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDAO extends JpaRepository<Product,Integer> {
}
