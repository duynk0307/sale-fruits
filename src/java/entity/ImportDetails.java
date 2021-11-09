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
public class ImportDetails {
    private String productID;
    private String ipID;
    private double ipQuantity;
    private double ipPrice;
    private String sourceID;

    public ImportDetails() {
    }

    public ImportDetails(String productID, String ipID, double ipQuantity, double ipPrice, String sourceID) {
        this.productID = productID;
        this.ipID = ipID;
        this.ipQuantity = ipQuantity;
        this.ipPrice = ipPrice;
        this.sourceID = sourceID;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getIpID() {
        return ipID;
    }

    public void setIpID(String ipID) {
        this.ipID = ipID;
    }

    public double getIpQuantity() {
        return ipQuantity;
    }

    public void setIpQuantity(double ipQuantity) {
        this.ipQuantity = ipQuantity;
    }

    public double getIpPrice() {
        return ipPrice;
    }

    public void setIpPrice(double ipPrice) {
        this.ipPrice = ipPrice;
    }

    public String getSourceID() {
        return sourceID;
    }

    public void setSourceID(String sourceID) {
        this.sourceID = sourceID;
    }

    @Override
    public String toString() {
        return "ImportDetails{" + "productID=" + productID + ", ipID=" + ipID + ", ipQuantity=" + ipQuantity + ", ipPrice=" + ipPrice + ", sourceID=" + sourceID + '}';
    }
    
}
