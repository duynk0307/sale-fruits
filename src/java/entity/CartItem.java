/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Nguyen Khanh Duy;
 */
public class CartItem {

    private int cartID;
    private int sessionID;
    private String productID;
    private int quantity;
    private int state;

    public CartItem() {
    }

    public CartItem(int cartID, int sessionID, String productID, int quantity, int state) {
        this.cartID = cartID;
        this.sessionID = sessionID;
        this.productID = productID;
        this.quantity = quantity;
        this.state = state;
    }

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    public int getSessionID() {
        return sessionID;
    }

    public void setSessionID(int sessionID) {
        this.sessionID = sessionID;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "CartItem{" + "cartID=" + cartID + ", sessionID=" + sessionID + ", productID=" + productID + ", quantity=" + quantity + ", state=" + state + '}';
    }

}
