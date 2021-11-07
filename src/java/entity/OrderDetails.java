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
public class OrderDetails {
    private int orderID;
    private String productID;
    private double orderQuantity;
    private double orderPrice;
    private double total;

    public OrderDetails() {
    }

    public OrderDetails(int orderID, String productID, double orderQuantity, double orderPrice) {
        this.orderID = orderID;
        this.productID = productID;
        this.orderQuantity = orderQuantity;
        this.orderPrice = orderPrice;
    }

    public OrderDetails(int orderID, String productID, double orderQuantity, double orderPrice, double total) {
        this.orderID = orderID;
        this.productID = productID;
        this.orderQuantity = orderQuantity;
        this.orderPrice = orderPrice;
        this.total = total;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public double getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(double orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "OrderDetails{" + "orderID=" + orderID + ", productID=" + productID + ", orderQuantity=" + orderQuantity + ", orderPrice=" + orderPrice + ", total=" + total + '}';
    }

    
    
}
