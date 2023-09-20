package com.Narainox.OrderManagementSystem.Controller;

import com.Narainox.OrderManagementSystem.Model.Product;
import com.Narainox.OrderManagementSystem.Service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService) {
        super();
        this.productService = productService;
    }

    @PostMapping("/add")
    public ResponseEntity<Product> addProductHandler(@RequestBody Product product)
    {
         return new ResponseEntity<>(productService.createProduct(product), HttpStatus.CREATED);
    }

    @DeleteMapping("/remove/{productId}")
    public ResponseEntity<Product> removeProductHandler(@PathVariable Integer productId)
    {
        return new ResponseEntity<>(productService.deleteProduct(productId), HttpStatus.OK);
    }

    @GetMapping("/view/{productId}")
    public ResponseEntity<Product> viewProductHandler(@PathVariable Integer productId)
    {
        return new ResponseEntity<>(productService.viewProduct(productId), HttpStatus.FOUND);
    }

    @GetMapping("/viewAll")
    public ResponseEntity<List<Product>> viewAllProductHandler()
    {
        return new ResponseEntity<>(productService.viewAllProduct(), HttpStatus.FOUND);
    }

    @PutMapping("/update/{productId}")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product,@PathVariable Integer productId)
    {
        return new ResponseEntity<>(productService.updateProduct(product,productId),HttpStatus.OK);
    }
}
