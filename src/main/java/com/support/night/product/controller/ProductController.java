package com.support.night.product.controller;

import com.support.night.product.entity.Product;
import com.support.night.product.service.ProductService;
import com.support.night.user.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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
    @PutMapping(value = "{productId}",consumes = "application/json",produces = "application/json")
    public Product update(@RequestBody Product product, @PathVariable Long productId){
        Product product1=productservice.update(productId,product);
        return product1;
    }

    @DeleteMapping(value = "{productId}",produces = "application/json")
    public Map<String,String> delete(@PathVariable Long productId){
        Map<String,String> statusMessage=productservice.delete(productId);
        return statusMessage;
    }

    @GetMapping(value = "{productId}",produces = "application/json")
    public Map<String,Object> getById(@PathVariable Long productId){
        Map<String,Object> response=productservice.getById(productId);
        return response;
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
