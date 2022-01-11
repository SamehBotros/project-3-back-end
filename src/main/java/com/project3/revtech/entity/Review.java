package com.project3.revtech.entity;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private int reviewId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "product_id")
    private int productId;

    @CreatedDate
    @Column(name = "date")
    private Date date;

    @Column(name = "title")
    private String title;

    @Column(name = "rating")
    private int rating;

    @Column(name = "review")
    private String review;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false, insertable = false, updatable = false)
    private Product product;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false, insertable = false, updatable = false)
    private User user;

    public Review() {
        super();
    }

    public Review(int reviewId, int userId, int productId, Date date, String title, int rating, String review) {
        this.reviewId = reviewId;
        this.userId = userId;
        this.productId = productId;
        this.date = date;
        this.title = title;
        this.rating = rating;
        this.review = review;
    }

    public Review(int userId, int productId, Date date, String title, int rating, String review) {
        this.userId = userId;
        this.productId = productId;
        this.date = date;
        this.title = title;
        this.rating = rating;
        this.review = review;
    }

    public Review(int userId, int productId, String title, int rating, String review) {
        this.userId = userId;
        this.productId = productId;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
