package com.springsecurity2023.Controller;

import com.springsecurity2023.Model.Product;
import com.springsecurity2023.Service.Impl.ProductserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductControlller {
    @Autowired
    private ProductserviceImpl productservice;

    //create product
    @PostMapping
    public String createproduct(@RequestBody Product product){
        return  productservice.saveproduct(product);
    }
    //get all products
    @GetMapping
    public List<Product> getallproducts(){
        return  productservice.getallproducts();
    }

    //get product by name
    @GetMapping("/{name}")
    public Optional<Product> getproductbynamee(@PathVariable String name){
    return  productservice.getproductbyname(name);
    }

}
