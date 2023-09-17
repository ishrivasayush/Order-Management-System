package com.Narainox.OrderManagementSystem.Controller;

import com.Narainox.OrderManagementSystem.Model.Customer;
import com.Narainox.OrderManagementSystem.Service.CustomerService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController{

    CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        super();
        this.customerService = customerService;
    }

    @PostMapping("/add")
    public ResponseEntity<Customer> addCustomerHandler(@RequestBody Customer customer)
    {
        return new ResponseEntity<>(customerService.addCustomer(customer), HttpStatus.CREATED);
    }

    @GetMapping("/view/{id}")
    public ResponseEntity<Customer> viewCustomerHandler(@PathVariable Integer id)
    {
        return new ResponseEntity<>(customerService.viewCustomer(id) , HttpStatus.FOUND);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Customer> updateCustomerHandler(@PathVariable Integer id,@RequestBody Customer customer)
    {
        return new ResponseEntity<>(customerService.updateCustomer(id,customer) , HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Customer> removeCustomerHandler(@PathVariable Integer id,@RequestBody Customer customer)
    {
        return new ResponseEntity<>(customerService.removeCustomer(id),HttpStatus.OK);
    }

}
