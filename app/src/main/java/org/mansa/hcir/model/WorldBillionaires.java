package org.mansa.hcir.model;

/**
 * Created by mansa on 12/3/15.
 */
public class WorldBillionaires {

    private String billionairesname, billionairesImgUrl;
    private int year;
    private String source;
    private String worth;

    public String getBillionairesname() {
        return billionairesname;
    }

    public void setBillionairesname(String billionairesname) {
        this.billionairesname = billionairesname;
    }

    public String getBillionairesImgUrl() {
        return billionairesImgUrl;
    }

    public void setBillionairesImgUrl(String billionairesImgUrl) {
        this.billionairesImgUrl = billionairesImgUrl;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getWorth() {
        return worth;
    }

    public void setWorth(String worth) {
        this.worth = worth;
    }

}


