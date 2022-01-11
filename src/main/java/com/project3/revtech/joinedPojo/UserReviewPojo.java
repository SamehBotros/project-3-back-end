package com.project3.revtech.joinedPojo;

import java.sql.Date;

public class UserReviewPojo {

    private int reviewId;
    private int userId;
    private String firstName;
    private String lastName;
    private int productId;
    private Date date;
    private String title;
    private int rating;
    private String review;

    public UserReviewPojo() {
        super();
    }

    public UserReviewPojo(int reviewId, int userId, String firstName, String lastName, int productId, Date date, String title, int rating, String review) {
        this.reviewId = reviewId;
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
