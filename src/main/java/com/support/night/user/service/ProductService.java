package com.support.night.user.service;

import com.support.night.user.entity.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);

    List<Product> findAll();
}
