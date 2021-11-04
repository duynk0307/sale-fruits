/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.List;

/**
 *
 * @author Nguyen Khanh Duy;
 */
public class CartSession {

    private int sessionID;
    private int userID;
    private double total;
    List<CartItem> listCartItem;
    public CartSession() {
    }

    public CartSession(int sessionID, int userID, double total, List<CartItem> listCartItem) {
        this.sessionID = sessionID;
        this.userID = userID;
        this.total = total;
        this.listCartItem = listCartItem;
    }

    public int getSessionID() {
        return sessionID;
    }

    public void setSessionID(int sessionID) {
        this.sessionID = sessionID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<CartItem> getListCartItem() {
        return listCartItem;
    }

    public void setListCartItem(List<CartItem> listCartItem) {
        this.listCartItem = listCartItem;
    }

    @Override
    public String toString() {
        return "CartSession{" + "sessionID=" + sessionID + ", userID=" + userID + ", total=" + total + ", listCartItem=" + listCartItem + '}';
    }

   

}
