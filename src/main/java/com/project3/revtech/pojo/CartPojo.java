package com.project3.revtech.pojo;

public class CartPojo {

    private int cartId;
    private int userId;
    private int cartTotal;
    private boolean cartPaid;
    private boolean cartRemoved;

    public CartPojo(int cartId, int userId, int cartTotal, boolean cartPaid, boolean cartRemoved) {
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    @Override
    public String toString() {
        return "CartPojo{" +
                "cartId=" + cartId +
                ", userId=" + userId +
                ", cartTotal=" + cartTotal +
                ", cartPaid=" + cartPaid +
                ", cartRemoved=" + cartRemoved +
                '}';
    }
}
