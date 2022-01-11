package com.project3.revtech.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "purchased_items")
public class PurchasedItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private int itemId;

    @Column(name = "transaction_id")
    private int transactionId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "cart_id")
    private int cartId;

    @Column(name = "product_id")
    private int productId;

    @Column(name = "item_qty")
    private int itemQty;

    @Column(name = "purchase_cost")
    private BigDecimal purchaseCost;

    @CreatedDate
    @Column(name = "purchase_date")
    private Date purchaseDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transaction_id", nullable = false, insertable = false, updatable = false)
    private Transaction transaction;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false, insertable = false, updatable = false)
    private Product product;



    public PurchasedItem() {
        super();
    }

    public PurchasedItem(int itemId, int transactionId, int userId, int cartId, int productId, int itemQty, BigDecimal purchaseCost, Date purchaseDate) {
        this.itemId = itemId;
        this.transactionId = transactionId;
        this.userId = userId;
        this.cartId = cartId;
        this.productId = productId;
        this.itemQty = itemQty;
        this.purchaseCost = purchaseCost;
        this.purchaseDate = purchaseDate;
    }

    public PurchasedItem(int transactionId, int userId, int cartId, int productId, int itemQty, BigDecimal purchaseCost, Date purchaseDate) {
        this.transactionId = transactionId;
        this.userId = userId;
        this.cartId = cartId;
        this.productId = productId;
        this.itemQty = itemQty;
        this.purchaseCost = purchaseCost;
        this.purchaseDate = purchaseDate;
    }

    public PurchasedItem(int transactionId, int userId, int cartId, int productId, int itemQty, BigDecimal purchaseCost) {
        this.transactionId = transactionId;
        this.userId = userId;
        this.cartId = cartId;
        this.productId = productId;
        this.itemQty = itemQty;
        this.purchaseCost = purchaseCost;
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

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
