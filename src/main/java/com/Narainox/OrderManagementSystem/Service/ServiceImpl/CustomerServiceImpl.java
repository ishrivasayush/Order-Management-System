package com.Narainox.OrderManagementSystem.Service.ServiceImpl;

import com.Narainox.OrderManagementSystem.Exception.CustomerException;
import com.Narainox.OrderManagementSystem.Model.Customer;
import com.Narainox.OrderManagementSystem.Repository.CustomerDAO;
import com.Narainox.OrderManagementSystem.Service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    CustomerDAO customerDAO;

    public CustomerServiceImpl(CustomerDAO customerDAO) {
        super();
        this.customerDAO = customerDAO;
    }

    @Override
    public Customer addCustomer(Customer customer) {
        Optional<Customer> cus = customerDAO.findById(customer.getCustomerId());
        if (cus.isPresent())
        {
            throw new CustomerException("Customer Already Exit!");
        }
        else {
            return customerDAO.save(customer);
        }
    }
    public Customer removeCustomer(Integer id) {
        Optional<Customer> cus = customerDAO.findById(id);
        if (cus.isPresent())
        {
            Customer customer = cus.get();
            customerDAO.deleteById(id);
            return customer;
        }
        else {
            throw new CustomerException("Customer Doesn't Exit With Id "+id);
        }
    }

    public Customer updateCustomer(Integer id,Customer customers) {
        Optional<Customer> cus = customerDAO.findById(id);
        if (cus.isPresent())
        {
            Customer customer = cus.get();
            customer.setFullName(customers.getFullName());
            customer.setAge(customers.getAge());
            customer.setAddress(customers.getAddress());
            customer.setMobileNumber(customers.getMobileNumber());
            return customer;
        }
        else {
            throw new CustomerException("Customer Doesn't Exit With Id"+id);
        }
    }

    public Customer viewCustomer(Integer id) {
        Optional<Customer> cus = customerDAO.findById(id);
        if (cus.isPresent())
        {
            Customer customer = cus.get();
            return customer;
        }
        else {
            throw new CustomerException("Customer Doesn't Exit With Id"+id);
        }
    }



}
