/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Minh Nhat
 */
public class Banner {
    private String bnrID;
    private String content;

    public Banner() {
    }

    public Banner(String bnrID, String content) {
        this.bnrID = bnrID;
        this.content = content;
    }

    public String getBnrID() {
        return bnrID;
    }

    public void setBnrID(String bnrID) {
        this.bnrID = bnrID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Banner{" + "bnrID=" + bnrID + ", content=" + content + '}';
    }
    
}
