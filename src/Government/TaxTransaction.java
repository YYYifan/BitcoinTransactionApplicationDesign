/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Government;

import Bitcoin.Transaction;
import java.util.Date;

/**
 *
 * @author owner
 */
public class TaxTransaction {
    private String direction;
    private Date date;
    
    private double fee;
   private String investor;
    private Transaction transaction;
    
    private int tid;
    private static int count =1;
    
    public TaxTransaction() {
        transaction = new Transaction();
        tid = count;
        count++;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String getInvestor() {
        return investor;
    }

    public void setInvestor(String investor) {
        this.investor = investor;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }
    
}
