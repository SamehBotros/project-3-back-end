package com.project3.revtech.joinedPojo;

import com.project3.revtech.pojo.ProductPojo;

import java.math.BigDecimal;
import java.sql.Date;

public class PurchasedItemProduct {

    private int itemId;
    private int transactionId;
    private int userId;
    private int cartId;
    private int productId;
    private int itemQty;
    private BigDecimal purchaseCost;
    private Date purchaseDate;
    private ProductPojo product;

    public PurchasedItemProduct() {
        super();
    }

    public PurchasedItemProduct(int itemId, int transactionId, int userId, int cartId, int productId, int itemQty, BigDecimal purchaseCost, Date purchaseDate, ProductPojo product) {
        this.itemId = itemId;
        this.transactionId = transactionId;
        this.userId = userId;
        this.cartId = cartId;
        this.productId = productId;
        this.itemQty = itemQty;
        this.purchaseCost = purchaseCost;
        this.purchaseDate = purchaseDate;
        this.product = product;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getItemQty() {
        return itemQty;
    }

    public void setItemQty(int itemQty) {
        this.itemQty = itemQty;
    }

    public BigDecimal getPurchaseCost() {
        return purchaseCost;
    }

    public void setPurchaseCost(BigDecimal purchaseCost) {
        this.purchaseCost = purchaseCost;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public ProductPojo getProduct() {
        return product;
    }

    public void setProduct(ProductPojo product) {
        this.product = product;
    }
}
