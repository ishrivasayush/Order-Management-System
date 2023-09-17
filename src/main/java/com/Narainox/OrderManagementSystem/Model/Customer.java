package com.Narainox.OrderManagementSystem.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;
    private String fullName;
    private Integer age;
    private String mobileNumber;
    private String address;
}
