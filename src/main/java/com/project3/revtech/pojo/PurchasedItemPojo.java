package com.project3.revtech.pojo;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;

public class PurchasedItemPojo {

    private int itemId;
    private int transactionId;
    private int userId;
    private int cartId;
    private int productId;
    private int itemQty;
    private BigDecimal purchaseCost;
    private Date purchaseDate;

    public PurchasedItemPojo() {
        super();
    }

    public PurchasedItemPojo(int itemId, int transactionId, int userId, int cartId, int productId, int itemQty, BigDecimal purchaseCost, Date purchaseDate) {
        this.itemId = itemId;
        this.transactionId = transactionId;
        this.userId = userId;
        this.cartId = cartId;
        this.productId = productId;
        this.itemQty = itemQty;
        this.purchaseCost = purchaseCost;
        this.purchaseDate = purchaseDate;
    }

    public PurchasedItemPojo(int transactionId, int userId, int cartId, int productId, int itemQty, BigDecimal purchaseCost, Date purchaseDate) {
        this.transactionId = transactionId;
        this.userId = userId;
        this.cartId = cartId;
        this.productId = productId;
        this.itemQty = itemQty;
        this.purchaseCost = purchaseCost;
        this.purchaseDate = purchaseDate;
    }

    public PurchasedItemPojo(int transactionId, int userId, int cartId, int productId, int itemQty, BigDecimal purchaseCost) {
        this.transactionId = transactionId;
        this.userId = userId;
        this.cartId = cartId;
        this.productId = productId;
        this.itemQty = itemQty;
        this.purchaseCost = purchaseCost;
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
}
