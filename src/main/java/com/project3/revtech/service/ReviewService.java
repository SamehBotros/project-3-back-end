package com.project3.revtech.service;

import com.project3.revtech.joinedPojo.UserReviewPojo;
import com.project3.revtech.pojo.ReviewPojo;

import java.util.List;

public interface ReviewService {
    ReviewPojo addReview(ReviewPojo review);
    ReviewPojo updateReview(ReviewPojo review);
    List<UserReviewPojo> getReviewsOfProduct(int productId);
}
