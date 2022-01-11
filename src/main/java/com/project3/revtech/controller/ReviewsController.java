package com.project3.revtech.controller;

import com.project3.revtech.joinedPojo.PurchasedItemProduct;
import com.project3.revtech.joinedPojo.UserReviewPojo;
import com.project3.revtech.pojo.PurchasedItemPojo;
import com.project3.revtech.pojo.ReviewPojo;
import com.project3.revtech.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path ="api/reviews")
public class ReviewsController {

    @Autowired
    ReviewService reviewService;

    @PostMapping("post")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    ReviewPojo addReview(@RequestBody ReviewPojo review) {
        return reviewService.addReview(review);
    }

    @GetMapping("all/{bid}/get")
    List<UserReviewPojo> getProductReviews(@PathVariable("bid") int productId) {
        return reviewService.getReviewsOfProduct(productId);
    }


}
