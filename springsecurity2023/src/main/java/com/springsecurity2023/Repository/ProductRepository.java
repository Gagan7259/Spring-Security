package com.springsecurity2023.Repository;

import com.springsecurity2023.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = "select * from product where name=?1", nativeQuery = true)
    Optional<Product> findproductByname(String name);
}
