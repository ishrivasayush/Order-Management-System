package com.Narainox.OrderManagementSystem.Service.ServiceImpl;

import com.Narainox.OrderManagementSystem.Exception.ProductException;
import com.Narainox.OrderManagementSystem.Model.Product;
import com.Narainox.OrderManagementSystem.Repository.ProductDAO;
import com.Narainox.OrderManagementSystem.Service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    ProductDAO productDAO;

    public ProductServiceImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    public Product createProduct(Product product) {
        return productDAO.save(product);
    }

    @Override
    public Product deleteProduct(Integer productId) {
        Optional<Product> product=productDAO.findById(productId);
        if (product.isPresent())
        {
            Product product1 = product.get();
            productDAO.deleteById(productId);
            return product1;
        }
        else {
            throw new ProductException("Product is Not exit With productId: "+productId);
        }
    }

    @Override
    public Product updateProduct(Product product, Integer productId) {
        Optional<Product> pro=productDAO.findById(productId);
        if (pro.isPresent())
        {
            Product product1 = pro.get();
            product1.setName(product.getName());
            product1.setPrice(product.getPrice());
            productDAO.save(product1);
            return product1;
        }
        else {
            throw new ProductException("Product is Not exit With productId: "+productId);
        }
    }

    @Override
    public Product viewProduct(Integer productId) {
        Optional<Product> product=productDAO.findById(productId);
        if (product.isPresent())
        {
            return product.get();
        }
        else {
            throw new ProductException("Product is Not exit With productId: "+productId);
        }
    }

    @Override
    public List<Product> viewAllProduct() {
        List<Product> products=productDAO.findAll();
        if (products.size()>0)
        {
            return products;
        }
        else {
            throw new ProductException("Product is Not exit ");
        }
    }
}
