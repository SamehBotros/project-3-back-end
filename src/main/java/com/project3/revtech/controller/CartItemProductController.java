package com.project3.revtech.controller;

import com.project3.revtech.joinedPojo.CartAndItemsPojo;
import com.project3.revtech.service.CartItemProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/cart-and-items")
public class CartItemProductController {

    @Autowired
    CartItemProductServiceImpl cartItemProductService;

    @GetMapping("cart/{bid}")
    CartAndItemsPojo getCart(@PathVariable("bid") int cartId) {
        return cartItemProductService.getAllCartItemProducts(cartId);
    }

    @GetMapping("user/{bid}")
    CartAndItemsPojo getCartByUser(@PathVariable("bid") int userId) {
        return cartItemProductService.getAllCartItemProductsForUser(userId);
    }

}

