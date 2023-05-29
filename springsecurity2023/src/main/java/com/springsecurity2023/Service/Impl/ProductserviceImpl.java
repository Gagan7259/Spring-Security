package com.springsecurity2023.Service.Impl;

import com.springsecurity2023.Model.Product;
import com.springsecurity2023.Repository.ProductRepository;
import com.springsecurity2023.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductserviceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public String saveproduct(Product product) {
        Product pro = productRepository.save(product);
        if (pro != null && pro.getName() != "") {
            return "Succesfully created";
        }
        return "Try agin Please";
    }

    @Override
    public List<Product> getallproducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getproductbyname(String name) {
        return productRepository.findproductByname(name);
    }
}
