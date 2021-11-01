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
public class Product {

    private String productID;
    private String productName;
    private String image;
    private String title;
    private String description;
    private String cateID;
    private double salePrice;
    private double inventory;

    public Product() {
    }

    public Product(String productID, String productName, String image, String title, String description, String cateID, double salePrice, double inventory) {
        this.productID = productID;
        this.productName = productName;
        this.image = image;
        this.title = title;
        this.description = description;
        this.cateID = cateID;
        this.salePrice = salePrice;
        this.inventory = inventory;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCateID() {
        return cateID;
    }

    public void setCateID(String cateID) {
        this.cateID = cateID;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getInventory() {
        return inventory;
    }

    public void setInventory(double inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Product{" + "productID=" + productID + ", productName=" + productName + ", image=" + image + ", title=" + title + ", description=" + description + ", cateID=" + cateID + ", salePrice=" + salePrice + ", inventory=" + inventory + '}';
    }

}
