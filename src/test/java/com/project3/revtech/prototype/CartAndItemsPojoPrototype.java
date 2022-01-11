package com.project3.revtech.prototype;

import com.project3.revtech.entity.Cart;
import com.project3.revtech.entity.CartItem;
import com.project3.revtech.entity.Discount;
import com.project3.revtech.entity.Product;
import com.project3.revtech.joinedPojo.CartAndItemsPojo;
import com.project3.revtech.joinedPojo.ItemProductDiscountPojo;
import com.project3.revtech.joinedPojo.ProductAndDiscountPojo;
import com.project3.revtech.pojo.CartPojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CartAndItemsPojoPrototype {
    public static CartAndItemsPojo cartAndItemsTestObj() {
        List<ItemProductDiscountPojo> cartItems = itemProductDiscountPojoTestList();
        Cart cartEntity = cartTestObj();
        return new CartAndItemsPojo(cartEntity.getCartId(), cartEntity.getUserId(), cartEntity.getCartTotal(), cartEntity.isCartPaid(), cartEntity.isCartRemoved(), cartItems);
    }

    public static Cart cartTestObj() {
        Cart cart = new Cart(1, 1, 100, false, false);
        cart.setCartItems(cartItemTestList());
        return cart;
    }

    public static CartPojo cartPojoTestObj() {
        Cart cartEntity = cartTestObj();
        return new CartPojo(cartEntity.getCartId(), cartEntity.getUserId(), cartEntity.getCartTotal(), cartEntity.isCartPaid(), cartEntity.isCartRemoved());
    }

    public static List<CartItem> cartItemTestList() {
        List <CartItem> items = new ArrayList<CartItem>();
        items.add(cartItemTestObj());
        return items;
    }


    public static CartItem cartItemTestObj() {
        CartItem item = new CartItem(1, 1, 1, 3);
        item.setProduct(productTestObj());
        return item;
    }

    public static Product productTestObj() {
        Product product = new Product(  1, "12345", "iphone",
                                        new BigDecimal("25.05"), "phones",
                                        "String productDescription", 5,
                                        "String imageUrl", false
        );
        product.setDiscount(discountTestObj());
        return product;
    }

    public static Discount discountTestObj() {
        return new Discount(1, 1, " discountDescription", new BigDecimal("20.00"));
    }

    public static ProductAndDiscountPojo productAndDiscountPojoTestObj() {
        Product testProduct = productTestObj();
        Discount testDiscount = discountTestObj();
        return new ProductAndDiscountPojo(  testProduct.getProductId(), testProduct.getProductSku(), testProduct.getProductName(),
                                            testProduct.getProductCost(), testProduct.getProductCategory(), testProduct.getProductDescription(),
                                            testProduct.getProductQty(), testProduct.getImageUrl(), testProduct.isProductRemoved(),
                                            testDiscount.getDiscountId(), testDiscount.getDiscountDescription(), testDiscount.getDiscountPercentage()
        );
    }

    public static ItemProductDiscountPojo itemProductDiscountPojoTestObj() {
        CartItem tempItem = cartItemTestObj();
        Product tempProduct = productTestObj();
        Discount tempDiscount = discountTestObj();
        ProductAndDiscountPojo tempPAD = new ProductAndDiscountPojo(tempProduct.getProductId(), tempProduct.getProductSku(),
                tempProduct.getProductName(), tempProduct.getProductCost(), tempProduct.getProductCategory(),
                tempProduct.getProductDescription(), tempProduct.getProductQty(), tempProduct.getImageUrl(),
                tempProduct.isProductRemoved(), tempDiscount.getDiscountId(), tempDiscount.getDiscountDescription(),
                tempDiscount.getDiscountPercentage()
        );
        return new ItemProductDiscountPojo(tempItem.getCartItemId(), tempItem.getCartId(), tempItem.getProductId(), tempItem.getCartQty(), tempPAD);
    }

    public static List<ItemProductDiscountPojo> itemProductDiscountPojoTestList() {
        List<ItemProductDiscountPojo> items = new ArrayList<ItemProductDiscountPojo>();
        items.add(itemProductDiscountPojoTestObj());
        return items;
    }


}
