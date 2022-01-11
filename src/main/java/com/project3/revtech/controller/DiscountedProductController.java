package com.project3.revtech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.project3.revtech.exception.ApplicationException;
import com.project3.revtech.joinedPojo.ProductAndDiscountPojo;
import com.project3.revtech.service.ProductDiscountService;

@RestController
@CrossOrigin
@RequestMapping(path ="discount")
public class DiscountedProductController {
	
	@Autowired
	ProductDiscountService productDiscountService;
	
	
	//Returns all Products along with there discounts
    @GetMapping("all/discountedProducts")
    List<ProductAndDiscountPojo> getAllProducts() throws ApplicationException{
        return productDiscountService.getAllDiscountedProducts();
    }
}
