/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bitcoin;

import Bank.Customer;
import java.util.Date;

/**
 *
 * @author owner
 */
public class MatchPair {
    private int id;
    private static int count=1;
    
    private String seller;
    private String buyer;
    private int quantity;
    private int buyerQuantity;
    private double total;
    private Date date;
    private String status;
    private String buyerStatus;
    
    public MatchPair () {
        id = count;
        count++;
//        seller = new Customer();
//        buyer = new Customer();
        date = new Date();
    }

    public String getBuyerStatus() {
        return buyerStatus;
    }

    public void setBuyerStatus(String buyerStatus) {
        this.buyerStatus = buyerStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getBuyerQuantity() {
        return buyerQuantity;
    }

    public void setBuyerQuantity(int buyerQuantity) {
        this.buyerQuantity = buyerQuantity;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
