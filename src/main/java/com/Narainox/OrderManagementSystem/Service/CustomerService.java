package com.Narainox.OrderManagementSystem.Service;

import com.Narainox.OrderManagementSystem.Model.Customer;

public interface CustomerService  {
    Customer addCustomer(Customer customer);
    Customer removeCustomer(Integer id);
    Customer updateCustomer(Integer id,Customer customers);
    Customer viewCustomer(Integer id);
}
