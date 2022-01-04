package com.project3.revtech.entity;

import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// @Getter
// @Setter
// @NoArgsConstructor
@ToString
@Entity
@Table(name = "cart_details")
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cart_id")
	private int cartId;

	@OneToOne(mappedBy = "cart")
	private Transaction transaction;

	@Column(name = "user_id")
	private int userId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false, insertable = false, updatable = false)
	private User user;

	@OneToMany(mappedBy = "cart")
	private List<CartItem> cartItems;
	
	@Column(name = "cart_total")
	private int cartTotal;

	@Column(name = "cart_paid")
	private boolean cartPaid;

	@Column(name = "cart_removed")
	private boolean cartRemoved;
	
	public Cart() {
		super();
	}

	//This constructor will only be used for joined tables. Do not use
	public Cart(int cartId, Transaction transaction, int userId, User user, List<CartItem> cartItems, int cartTotal,
			boolean cartPaid, boolean cartRemoved) {
		super();
		this.cartId = cartId;
		this.transaction = transaction;
		this.userId = userId;
		this.user = user;
		this.cartItems = cartItems;
		this.cartTotal = cartTotal;
		this.cartPaid = cartPaid;
		this.cartRemoved = cartRemoved;
	}

	public Cart(int cartId, int userId, int cartTotal, boolean cartPaid, boolean cartRemoved) {
		this.cartId = cartId;
		this.userId = userId;
		this.cartTotal = cartTotal;
		this.cartPaid = cartPaid;
		this.cartRemoved = cartRemoved;
	}

	public Cart(int userId, int cartTotal, boolean cartPaid, boolean cartRemoved) {
		this.cartId = cartId;
		this.userId = userId;
		this.cartTotal = cartTotal;
		this.cartPaid = cartPaid;
		this.cartRemoved = cartRemoved;
	}


	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	public int getCartTotal() {
		return cartTotal;
	}

	public void setCartTotal(int cartTotal) {
		this.cartTotal = cartTotal;
	}

	public boolean isCartPaid() {
		return cartPaid;
	}

	public void setCartPaid(boolean cartPaid) {
		this.cartPaid = cartPaid;
	}

	public boolean isCartRemoved() {
		return cartRemoved;
	}

	public void setCartRemoved(boolean cartRemoved) {
		this.cartRemoved = cartRemoved;
	}
}
