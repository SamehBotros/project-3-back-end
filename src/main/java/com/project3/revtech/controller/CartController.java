package com.project3.revtech.controller;

import com.project3.revtech.exception.ApplicationException;
import com.project3.revtech.pojo.CartPojo;
import com.project3.revtech.service.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/cart")
@CrossOrigin
public class CartController {
    @Autowired
    CartServiceImpl cartService;

    @PostMapping
    ResponseEntity<CartPojo> addCart(@RequestBody CartPojo cart) throws ApplicationException {
        return ResponseEntity.ok()
                .header("Content-type", "application/json")
                .body(cartService.addCart(cart));

    }

    @PutMapping
    ResponseEntity<CartPojo> updateCart(@RequestBody CartPojo cart) throws ApplicationException {
        return ResponseEntity.ok()
                .header("Content-type", "application/json")
                .body(cartService.updateCart(cart));

    }


}
