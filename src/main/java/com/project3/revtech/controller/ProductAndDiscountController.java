package com.project3.revtech.controller;

import com.project3.revtech.exception.ApplicationException;
import com.project3.revtech.joinedPojo.ProductAndDiscountPojo;
import com.project3.revtech.pojo.CartPojo;
import com.project3.revtech.service.ProductDiscountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/product-discount")
public class ProductAndDiscountController {

    @Autowired
    ProductDiscountServiceImpl productDiscountService;

    @GetMapping("{bid}/get")
    ResponseEntity<ProductAndDiscountPojo> getItem(@PathVariable("bid") int productId) throws ApplicationException {
        return ResponseEntity.ok()
                .header("Content-type", "application/json")
                .body(productDiscountService.getOneProductWithDiscount(productId));
    }
}
