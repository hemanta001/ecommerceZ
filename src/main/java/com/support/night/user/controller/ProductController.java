package com.support.night.user.controller;

import com.support.night.user.entity.Product;
import com.support.night.user.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {

    private final ProductService productservice;

    public ProductController(ProductService productService) {
        this.productservice = productService;
    }

    @PostMapping(consumes = "application/json" , produces = "application/json")
    public Product save(@RequestBody Product product){
        Product product1 = productservice.save(product);
        return product1;
    }
}
