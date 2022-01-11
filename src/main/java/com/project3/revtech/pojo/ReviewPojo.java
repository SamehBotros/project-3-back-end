package com.project3.revtech.pojo;

import java.sql.Date;

public class ReviewPojo {

    private int reviewId;
    private int userId;
    private int productId;
    private Date date;
    private String title;
    private int rating;
    private String review;

    public ReviewPojo() {
        super();
    }

    public ReviewPojo(int reviewId, int userId, int productId, Date date, String title, int rating, String review) {
        this.reviewId = reviewId;
        this.userId = userId;
        this.productId = productId;
        this.date = date;
        this.title = title;
        this.rating = rating;
        this.review = review;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
