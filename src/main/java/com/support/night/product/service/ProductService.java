package com.support.night.product.service;

import com.support.night.product.entity.Product;

import java.util.List;
import java.util.Map;

public interface ProductService {
    Product save(Product product);

    Product update(Long id, Product product);

    Map<String, String> delete(Long id);

    Map<String,Object> getById(Long id);

    List<Product> findAll();

    List<Product> findAllByProductName(String productName);
    List<Product> findAllByProductNameAndProductCategory(String productName, String productCategory);
}
