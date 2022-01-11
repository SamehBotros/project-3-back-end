package com.project3.revtech.service;

import com.project3.revtech.entity.PurchasedItem;
import com.project3.revtech.exception.ApplicationException;
import com.project3.revtech.pojo.CartItemPojo;
import com.project3.revtech.pojo.PurchasedItemPojo;

import java.util.List;

public interface CartItemService {


    CartItemPojo addItem(CartItemPojo item) throws ApplicationException;
    CartItemPojo updateItem(CartItemPojo item) throws ApplicationException;
    CartItemPojo getCartItem(int item) throws ApplicationException;
    List<CartItemPojo> getAllItemsOfCart(int cartId) throws ApplicationException;
    List<PurchasedItemPojo> getAllPurchasedItemsOfCart(int cartId, int transactionId) throws ApplicationException;
    boolean removeItem(int itemId) throws ApplicationException;
    boolean checkIfExistsInCart(int cartId, int productId) throws ApplicationException;
    boolean checkIfNoQty(int cartId, int productId) throws ApplicationException;

}
