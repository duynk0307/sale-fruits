/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author ongno
 */
public class Sources {

    private String sourceID;
    private String sourceName;
    private String sourceLogo;

    public Sources() {
    }

    public Sources(String sourceID, String sourceName, String sourceLogo) {
        this.sourceID = sourceID;
        this.sourceName = sourceName;
        this.sourceLogo = sourceLogo;
    }

    public String getSourceID() {
        return sourceID;
    }

    public void setSourceID(String sourceID) {
        this.sourceID = sourceID;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceLogo() {
        return sourceLogo;
    }

    public void setSourceLogo(String sourceLogo) {
        this.sourceLogo = sourceLogo;
    }

    @Override
    public String toString() {
        return "Sources{" + "sourceID=" + sourceID + ", sourceName=" + sourceName + ", sourceLogo=" + sourceLogo + '}';
    }
}
