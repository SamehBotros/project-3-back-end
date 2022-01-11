package com.project3.revtech.service;

import com.project3.revtech.dao.ReviewRepository;
import com.project3.revtech.entity.Review;
import com.project3.revtech.joinedPojo.UserReviewPojo;
import com.project3.revtech.pojo.ReviewPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    @Override
    public ReviewPojo addReview(ReviewPojo review) {
        Review newReview = new Review(review.getUserId(), review.getProductId(), review.getTitle(), review.getRating(), review.getReview());
        newReview =  reviewRepository.saveAndFlush(newReview);
        review.setReviewId(newReview.getReviewId());
        return review;
    }

    @Override
    public ReviewPojo updateReview(ReviewPojo review) {
        return null;
    }

    @Override
    public List<UserReviewPojo> getReviewsOfProduct(int productId) {
        List<Review> allReviews = reviewRepository.findAllByProductIdEquals(productId);
        List<UserReviewPojo> returningReviews = new ArrayList<UserReviewPojo>();
        for (Review review : allReviews) {
            UserReviewPojo temp = new UserReviewPojo(   review.getReviewId(), review.getUserId(), review.getUser().getFirst_name(),
                                                        review.getUser().getLast_name(), review.getProductId(), review.getDate(),
                                                        review.getTitle(), review.getRating(), review.getReview()
            );
            returningReviews.add(temp);
        }
        return returningReviews;
    }
}
