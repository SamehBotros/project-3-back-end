package com.project3.revtech.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// @Getter
// @Setter
// @NoArgsConstructor
//@ToString
@Entity
@Table(name = "cart_items")
public class CartItem {
	
	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cart_item_id")
	private int cartItemId;
	
	public int getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public int getCartQty() {
		return cartQty;
	}

	public void setCartQty(int cartQty) {
		this.cartQty = cartQty;
	}

	@Column(name = "cart_id")
	private int cartId;

	@Column(name = "product_id")
	private int productId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id", nullable = false, insertable = false, updatable = false)
	private Product product;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cart_id", nullable = false, insertable = false, updatable = false)
	private Cart cart;

	@Column(name = "cart_qty")
	private int cartQty;

	public CartItem(int cartItemId, int cartId, int productId, Product product, Cart cart, int cartQty) {
		super();
		this.cartItemId = cartItemId;
		this.cartId = cartId;
		this.productId = productId;
		this.product = product;
		this.cart = cart;
		this.cartQty = cartQty;
	}

	public CartItem(int cartItemId, int cartId, int productId, int cartQty) {
		this.cartItemId = cartItemId;
		this.cartId = cartId;
		this.productId = productId;
		this.cartQty = cartQty;
	}
	public CartItem( int cartId, int productId, int cartQty) {
		this.cartId = cartId;
		this.productId = productId;
		this.cartQty = cartQty;
	}

	@Override
	public String toString() {
		return "CartItem{" +
				"cartItemId=" + cartItemId +
				", cartId=" + cartId +
				", productId=" + productId +
				", product=" + product +
				", cart=" + cart +
				", cartQty=" + cartQty +
				'}';
	}
}
