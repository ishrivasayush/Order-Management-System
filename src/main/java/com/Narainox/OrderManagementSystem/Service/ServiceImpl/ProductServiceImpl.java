package com.Narainox.OrderManagementSystem.Service.ServiceImpl;

import com.Narainox.OrderManagementSystem.Repository.ProductDAO;
import com.Narainox.OrderManagementSystem.Service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    ProductDAO productDAO;

    public ProductServiceImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }
}
