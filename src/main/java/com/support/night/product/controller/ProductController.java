package com.support.night.product.controller;

import com.support.night.product.entity.Product;
import com.support.night.product.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping(value = "findByProductName", produces = "application/json")
    public List<Product> findAllByProductName(@RequestParam(value = "productName") String productName)
    {
        List<Product> productList = productservice.findAllByProductName(productName);
        return productList;
    }

    @GetMapping(value = "findAllByProductNameAndProductCateogry", produces = "application/json")
    public List<Product> findAllByProductNameAndProductCateogry(@RequestParam(value = "productName") String productName, @RequestParam(value = "productCategory") String productCategory)
    {
        List<Product> productList = productservice.findAllByProductNameAndProductCategory(productName, productCategory);
        return productList;
    }
}
