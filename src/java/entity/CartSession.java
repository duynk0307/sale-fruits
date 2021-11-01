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
public class CartSession {

    private int sessionID;
    private int userID;
    private double total;

    public CartSession() {
    }

    public CartSession(int sessionID, int userID, double total) {
        this.sessionID = sessionID;
        this.userID = userID;
        this.total = total;
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

    @Override
    public String toString() {
        return "CartSession{" + "sessionID=" + sessionID + ", userID=" + userID + ", total=" + total + '}';
    }

}
