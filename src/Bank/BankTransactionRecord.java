/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author owner
 */
public class BankTransactionRecord {
    private String senderBank;
    private int senderAccountNumber;
    private String senderName;
    private String receiverBank;
    private int receiverAccountNumber;
    private String receiverName;
    private String direction;
    private Date date;
    
    private double fee;
    
    private String customer;
    private int accountNumber;
    
    private int tid;
    private static int count =1;
    public BankTransactionRecord() {
        tid = count;
        count++;
       
    }

    public String getSenderBank() {
        return senderBank;
    }

    public void setSenderBank(String senderBank) {
        this.senderBank = senderBank;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }



    public String getReceiverBank() {
        return receiverBank;
    }

    public void setReceiverBank(String receiverBank) {
        this.receiverBank = receiverBank;
    }

    public int getSenderAccountNumber() {
        return senderAccountNumber;
    }

    public void setSenderAccountNumber(int senderAccountNumber) {
        this.senderAccountNumber = senderAccountNumber;
    }

    public int getReceiverAccountNumber() {
        return receiverAccountNumber;
    }

    public void setReceiverAccountNumber(int receiverAccountNumber) {
        this.receiverAccountNumber = receiverAccountNumber;
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

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }



    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }
    
}

