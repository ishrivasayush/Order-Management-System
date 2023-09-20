package com.Narainox.OrderManagementSystem.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    private String name;
    private Integer price;

    @ManyToOne
    @JoinColumn(name = "orderID")
    Order order;
}
