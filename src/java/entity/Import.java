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
public class Import {

    private String ipID;
    private String ipDate;
    private String userID;

    public Import() {
    }

    public Import(String ipID, String ipDate, String userID) {
        this.ipID = ipID;
        this.ipDate = ipDate;
        this.userID = userID;
    }

    public String getIpID() {
        return ipID;
    }

    public void setIpID(String ipID) {
        this.ipID = ipID;
    }

    public String getIpDate() {
        return ipDate;
    }

    public void setIpDate(String ipDate) {
        this.ipDate = ipDate;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "Import{" + "ipID=" + ipID + ", ipDate=" + ipDate + ", userID=" + userID + '}';
    }

}
