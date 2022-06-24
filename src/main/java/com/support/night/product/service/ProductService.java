package com.support.night.product.service;

import com.support.night.product.entity.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);

    List<Product> findAll();
}
