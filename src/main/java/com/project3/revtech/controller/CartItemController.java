package com.project3.revtech.controller;

import com.project3.revtech.exception.ApplicationException;
import com.project3.revtech.pojo.CartItemPojo;
import com.project3.revtech.service.CartItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/cart-items")
@CrossOrigin
public class CartItemController {

    @Autowired
    CartItemServiceImpl cartItemService;

    @PostMapping("post")
    ResponseEntity<CartItemPojo> addItem(@RequestBody CartItemPojo cartItem) throws ApplicationException {
        return ResponseEntity.ok()
                .header("Content-type", "application/json")
                .body(cartItemService.addItem(cartItem));
    }

    @PutMapping("put")
    ResponseEntity<CartItemPojo> updateItem(@RequestBody CartItemPojo cartItem) throws ApplicationException {

        return ResponseEntity.ok()
                .header("Content-type", "application/json")
                .body(cartItemService.updateItem(cartItem));
    }


    @DeleteMapping("{bid}/delete")
    ResponseEntity<Boolean> removeItem(@PathVariable("bid") int cartItemId) throws ApplicationException {
        return ResponseEntity.ok()
                .header("Content-type", "application/json")
                .body(cartItemService.removeItem(cartItemId));
    }

}
