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
public class OrderItem {
    private int orderID;
    private String dateofOrder;
    private int userID;
    private String delivered;

    public OrderItem() {
    }

    public OrderItem(int orderID, String dateofOrder, int userID, String delivered) {
        this.orderID = orderID;
        this.dateofOrder = dateofOrder;
        this.userID = userID;
        this.delivered = delivered;
    }

    public OrderItem(int orderID, String dateofOrder, int userID, String delivered, double total) {
        this.orderID = orderID;
        this.dateofOrder = dateofOrder;
        this.userID = userID;
        this.delivered = delivered;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getDateofOrder() {
        return dateofOrder;
    }

    public void setDateofOrder(String dateofOrder) {
        this.dateofOrder = dateofOrder;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getDelivered() {
        return delivered;
    }

    public void setDelivered(String delivered) {
        this.delivered = delivered;
    }

    @Override
    public String toString() {
        return "OrderItem{" + "orderID=" + orderID + ", dateofOrder=" + dateofOrder + ", userID=" + userID + ", delivered=" + delivered +"'}'";
    }

    
    
}
