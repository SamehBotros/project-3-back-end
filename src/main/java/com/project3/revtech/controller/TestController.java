package com.project3.revtech.controller;

import com.project3.revtech.joinedPojo.CartAndItemsPojo;
import com.project3.revtech.service.CartItemProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/test")
public class TestController {

    @Autowired
    CartItemProductServiceImpl cartItemProductService;

    @GetMapping
    CartAndItemsPojo getCart() {
        System.out.println("inside");
        return cartItemProductService.getAllCartItemProducts(1);
    }
    @GetMapping("/all")
    public String allAccess() {
      return "Public Content.";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('USER') or hasRole('EMPLOYEE') or hasRole('ADMIN')")
    public String userAccess() {
      return "User Content.";
    }

    @GetMapping("/mod")
    @PreAuthorize("hasRole('MODERATOR')")
    public String moderatorAccess() {
      return "Moderator Board.";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess() {
      return "Admin Board.";
    }

}
