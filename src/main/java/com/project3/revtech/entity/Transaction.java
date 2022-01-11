package com.project3.revtech.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

// @Getter
// @Setter
// @NoArgsConstructor
@ToString
@Entity
@Table(name = "transaction_details")
public class Transaction {

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transaction_id")
	private int transactionId;

	@CreationTimestamp
	@Column(name = "transaction_date")
	private Timestamp transactionDate;

	@Column(name = "cart_id")
	private int cartId;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cart_id", nullable = false, insertable = false, updatable = false)
	private Cart cart;

	@OneToMany(mappedBy = "transaction")
	private List<PurchasedItem> purchasedItems;


	public Transaction(int transactionId, @NotNull Timestamp transactionDate, int cartId, Cart cart) {
		super();
		this.transactionId = transactionId;
		this.transactionDate = transactionDate;
		this.cartId = cartId;
		this.cart = cart;
	}

	public Transaction(int transactionId, Timestamp transactionDate, int cartId) {
		this.transactionId = transactionId;
		this.transactionDate = transactionDate;
		this.cartId = cartId;
	}

	public Transaction(int cartId) {
		this.cartId = cartId;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public Timestamp getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Timestamp transactionDate) {
		this.transactionDate = transactionDate;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public List<PurchasedItem> getPurchasedItems() {
		return purchasedItems;
	}

	public void setPurchasedItems(List<PurchasedItem> purchasedItems) {
		this.purchasedItems = purchasedItems;
	}
}
