package com.project3.revtech.dao;


import com.project3.revtech.entity.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepository extends JpaRepository<Discount, Integer> {
    Discount findByDiscountId(int discountId);
}

