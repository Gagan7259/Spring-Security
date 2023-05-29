package com.springsecurity2023.Service;

import com.springsecurity2023.Model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {


    //create product
    String saveproduct(Product product);

    //get all products
    List<Product> getallproducts();

    //get product by name
    Optional<Product> getproductbyname(String name);
}
