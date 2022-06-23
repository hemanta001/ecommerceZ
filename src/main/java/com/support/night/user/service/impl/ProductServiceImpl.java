package com.support.night.user.service.impl;

import com.support.night.user.entity.Product;
import com.support.night.user.repository.ProductRepository;
import com.support.night.user.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product save(Product product)
    {
        Product product1 = this.productRepository.save(product);
        return product1;
    }

    public List<Product> findAll()
    {
        return null;
    }
}
