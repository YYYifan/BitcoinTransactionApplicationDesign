/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bitcoin;

import Bank.*;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author owner
 */
public class FeeTransaction {
    private String direction;
    private Date date;
    
    private double fee;
    private String seller;
    private String buyer;
    private Transaction transaction;
   
    private int tid;
//    private static int count =1;
    public FeeTransaction() {
        transaction = new Transaction();
        tid = transaction.getTid();
       
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
    
    
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

   

    public Date getDate() { 
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }
    
}

