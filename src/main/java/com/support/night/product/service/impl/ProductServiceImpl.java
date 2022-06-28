package com.support.night.product.service.impl;

import com.support.night.product.service.ProductService;
import com.support.night.product.entity.Product;
import com.support.night.product.repository.ProductRepository;
import com.support.night.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
        List<Product> productList=this.productRepository.findAll();
        return productList;
    }

    @Override
    public List<Product> findAllByProductName(String productName) {
        List<Product> productList=this.productRepository.findAllByProductName(productName);
        return productList;
    }

    @Override
    public List<Product> findAllByProductNameAndProductCategory(String productName, String productCategory) {
        List<Product> productList=this.productRepository.findAllByProductNameAndProductCategory(productName, productCategory);
        return productList;
    }
}
