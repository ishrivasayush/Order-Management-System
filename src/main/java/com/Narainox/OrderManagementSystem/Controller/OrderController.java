package com.Narainox.OrderManagementSystem.Controller;

import com.Narainox.OrderManagementSystem.Model.Order;
import com.Narainox.OrderManagementSystem.Service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {
    OrderService orderService;
    public OrderController(OrderService orderService) {
        super();
        this.orderService = orderService;
    }

    @PostMapping("/addOrder")
    public ResponseEntity<Order> addOrderHandler(@RequestBody Order order)
    {
        return new ResponseEntity<>(orderService.addOrder(order), HttpStatus.CREATED);
    }

    @GetMapping("/viewOrder/{orderId}")
    public ResponseEntity<Order> addOrderHandler(@PathVariable Integer orderId)
    {
        return new ResponseEntity<>(orderService.removeOrder(orderId), HttpStatus.FOUND);
    }

    @DeleteMapping("/removeOrder/{orderId}")
    public ResponseEntity<Order> removeOrderHandler(@PathVariable Integer orderId)
    {
        return new ResponseEntity<>(orderService.removeOrder(orderId),HttpStatus.OK);
    }

}
