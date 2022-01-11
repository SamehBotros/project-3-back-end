package com.project3.revtech.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// @Getter
// @Setter
// @NoArgsConstructor
@ToString
@Entity
@Table(name = "product_details")
public class Product {

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int productId;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public String getProductSku() {
		return productSku;
	}

	public void setProductSku(String productSku) {
		this.productSku = productSku;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getProductCost() {
		return productCost;
	}

	public void setProductCost(BigDecimal productCost) {
		this.productCost = productCost;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getProductQty() {
		return productQty;
	}

	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public boolean isProductRemoved() {
		return productRemoved;
	}

	public void setProductRemoved(boolean productRemoved) {
		this.productRemoved = productRemoved;
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	@OneToOne(mappedBy = "product")
	private Discount discount;

	@OneToOne(mappedBy = "product")
	private PurchasedItem purchasedItem;

	@NotNull
	@Column(name = "product_sku")
	private String productSku;

	@NotNull
	@Column(name = "product_name")
	private String productName;

	@Min(1)
	@Column(name = "product_cost")
	private BigDecimal productCost;

	@NotNull
	@Column(name = "product_category")
	private String productCategory;

	@NotNull
	@Column(name = "product_description")
	private String productDescription;

	@Column(name = "product_qty")
	private int productQty;

	@NotNull
	@Column(name = "image_url")
	private String imageUrl;

	@OneToMany(mappedBy = "product")
	private List<Image> images;

	@Column(name = "product_removed")
	private boolean productRemoved;

	@OneToMany(mappedBy = "product")
	private List<CartItem> cartItems;

	public Product(int productId, Discount discount, @NotNull String productSku, @NotNull String productName,
				   @Min(1) BigDecimal productCost, @NotNull String productCategory, @NotNull String productDescription,
				   int productQty, @NotNull String imageUrl, List<Image> images, boolean productRemoved,
				   List<CartItem> cartItems, ArrayList<String> getImageUrls) {
		super();
		this.productId = productId;
		this.discount = discount;
		this.productSku = productSku;
		this.productName = productName;
		this.productCost = productCost;
		this.productCategory = productCategory;
		this.productDescription = productDescription;
		this.productQty = productQty;
		this.imageUrl = imageUrl;
		this.images = images;
		this.productRemoved = productRemoved;
		this.cartItems = cartItems;
	}

	public Product(int productId, String productSku, String productName, BigDecimal productCost, String productCategory, String productDescription, int productQty, String imageUrl, boolean productRemoved) {
		this.productId = productId;
		this.productSku = productSku;
		this.productName = productName;
		this.productCost = productCost;
		this.productCategory = productCategory;
		this.productDescription = productDescription;
		this.productQty = productQty;
		this.imageUrl = imageUrl;
		this.productRemoved = productRemoved;
	}
}
