package com.project3.revtech.service;

import com.project3.revtech.dao.CartRepository;
import com.project3.revtech.entity.Cart;
import com.project3.revtech.entity.CartItem;
import com.project3.revtech.entity.Discount;
import com.project3.revtech.entity.Product;
import com.project3.revtech.joinedPojo.CartAndItemsPojo;
import com.project3.revtech.joinedPojo.ItemProductDiscountPojo;
import com.project3.revtech.joinedPojo.ProductAndDiscountPojo;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CartItemProductServiceImpl implements CartItemProductService {

    @Autowired
    CartRepository cartRepository;

    @Autowired CartServiceImpl cartService;


        @Override
    public CartAndItemsPojo getAllCartItemProducts(int cartId) {

        Cart cartEntity = cartRepository.getById(cartId);
            return getCartAndItemsPojo(cartEntity);
        }

    @Override
    public CartAndItemsPojo getAllCartItemProductsForUser(int userId) {
        Cart cartEntity = cartRepository.findByUserIdAndCartRemovedFalseAndCartPaidFalse(userId);
        if (cartEntity == null) {
            cartEntity = new Cart(userId, 0, false, false);
            cartEntity = cartRepository.saveAndFlush(cartEntity);
            System.out.println();
        }
        return getCartAndItemsPojo(cartEntity);
    }

    @NotNull
    private CartAndItemsPojo getCartAndItemsPojo(Cart cartEntity) {
        List<CartItem> cartItems = cartEntity.getCartItems() == null ? new ArrayList<CartItem>(): cartEntity.getCartItems();
        List<ItemProductDiscountPojo> joinedDataItems = new ArrayList<ItemProductDiscountPojo>();
        for (CartItem tempItem : cartItems) {
            Product tempProduct = tempItem.getProduct();
            Discount tempDiscount = (tempProduct.getDiscount() == null ? new Discount(true) : tempProduct.getDiscount());

            ProductAndDiscountPojo tempPAD = new ProductAndDiscountPojo(tempProduct.getProductId(), tempProduct.getProductSku(),
                    tempProduct.getProductName(), tempProduct.getProductCost(), tempProduct.getProductCategory(),
                    tempProduct.getProductDescription(), tempProduct.getProductQty(), tempProduct.getImageUrl(),
                    tempProduct.isProductRemoved(), tempDiscount.getDiscountId(), tempDiscount.getDiscountDescription(),
                    tempDiscount.getDiscountPercentage()
            );

            ItemProductDiscountPojo tempIPD = new ItemProductDiscountPojo(tempItem.getCartItemId(), tempItem.getCartId(), tempItem.getProductId(), tempItem.getCartQty(), tempPAD);
            joinedDataItems.add(tempIPD);
        }
        return new CartAndItemsPojo(cartEntity.getCartId(), cartEntity.getUserId(), cartEntity.getCartTotal(), cartEntity.isCartPaid(), cartEntity.isCartRemoved(), joinedDataItems);
    }
}
