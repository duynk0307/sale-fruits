/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author MInh Nhat
 */
public class Saleoff {

    private String productID;
    private Double saleOff;
    private String productName;
    private String image;
    private String title;
    private Double salePrice;
    private String cateName;

    public Saleoff() {
    }

    public Saleoff(String productID, Double saleOff, String productName, String image, String title, double salePrice, String cateName) {
        this.productID = productID;
        this.saleOff = saleOff;
        this.productName = productName;
        this.image = image;
        this.title = title;
        this.salePrice = salePrice;
        this.cateName = cateName;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public Double getSaleOff() {
        return saleOff;
    }

    public void setSaleOff(Double saleOff) {
        this.saleOff = saleOff;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    @Override
    public String toString() {
        return "Saleoff{" + "productID=" + productID + ", saleOff=" + saleOff + ", productName=" + productName + ", image=" + image + ", title=" + title + ", salePrice=" + salePrice + ", cateName=" + cateName + '}';
    }
    
    
}
