package com.project3.revtech.controller;

import com.project3.revtech.joinedPojo.PurchasedItemProduct;
import com.project3.revtech.pojo.PurchasedItemPojo;
import com.project3.revtech.service.PurchasedItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path ="api/purchased-items")
public class PurchasedItemsController {

    @Autowired
    PurchasedItemService purchasedItemService;

    @PostMapping("many/post")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    boolean addManyItems(@RequestBody ArrayList<PurchasedItemPojo> items) {
        return purchasedItemService.addMultipleItems(items);
    }

    @GetMapping("transaction/{bid}/get")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    List<PurchasedItemProduct> getItemsByTransactionId(@PathVariable("bid") int transactionId) {
        return purchasedItemService.getAllPurchasedProductsByTransactionId(transactionId);
    }

    @GetMapping("user/{bid}/get")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    List<PurchasedItemProduct> getItemsByUserId(@PathVariable("bid") int userId) {
        return purchasedItemService.getAllPurchasedProductsByUserId(userId);
    }

}
