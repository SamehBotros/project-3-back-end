package com.project3.revtech.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project3.revtech.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    //----- Product Custom JPA Queries ----------//
    Product findByProductId(int productId);

}
