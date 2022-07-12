package com.support.night.product.service.impl;

import com.support.night.product.service.ProductService;
import com.support.night.product.entity.Product;
import com.support.night.product.repository.ProductRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public Product save(Product product)
    {
        Product product1 = this.productRepository.save(product);
        return product1;
    }
    @Override
    public Product update(Long id,Product product)
    {
    product.setId(id);
    Product product1 = this.productRepository.save(product);
    return product1;
    }
@Override
    public Map<String, String> delete(Long id)
    {
        Optional<Product> optionalProduct=this.productRepository.findById(id);
        Map<String,String> messageMap=new HashMap<>();
        if(optionalProduct.isPresent()){
            this.productRepository.delete(optionalProduct.get());
            messageMap.put("message","successfully deleted");
        }
        else{
            messageMap.put("message","already deleted or id not found!! unable to delete");
        }
        return messageMap;
    }

    @Override
    public Map<String,Object> getById(Long id) {
        Map<String,Object> response=new HashMap<>();
        Optional<Product> optionalProduct=this.productRepository.findById(id);
        if(optionalProduct.isPresent()){
            Product product=optionalProduct.get();
            response.put("data",product);
        }
        else{
            response.put("message","Product not found under this id");
        }
        return response;
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
