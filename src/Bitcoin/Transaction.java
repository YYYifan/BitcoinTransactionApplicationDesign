/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bitcoin;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author owner
 */
public class Transaction {
    private String seller;
//    private int sid;
    private String buyer;
//    private int bid;
    
    private Date date;
    private int quantity;
    private ArrayList<Integer> bitcoins;
    private String taxStatus;
    private String feeStatus;
    
    private int tid;
    private static int count =1;
    public Transaction() {
        tid = count;
        count++;
        bitcoins = new ArrayList<>();
    }

    public String getTaxStatus() {
        return taxStatus;
    }

    public void setTaxStatus(String taxStatus) {
        this.taxStatus = taxStatus;
    }

    public String getFeeStatus() {
        return feeStatus;
    }

    public void setFeeStatus(String feeStatus) {
        this.feeStatus = feeStatus;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

//    public int getSid() {
//        return sid;
//    }
//
//    public void setSid(int sid) {
//        this.sid = sid;
//    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ArrayList<Integer> getBitcoins() {
        return bitcoins;
    }

    public void setBitcoins(ArrayList<Integer> bitcoins) {
        this.bitcoins = bitcoins;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }
    
}

