/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Supplier;

import Bank.Customer;
import Bitcoin.BitcoinCatalog;
import Bitcoin.Investor;
import java.util.Date;

/**
 *
 * @author owner
 */
public class SaleRecord {
    private Customer investor;
    private int quantity;
    private Date date;
    private double total;
    
    private BitcoinCatalog soldBitcoins;
    private int id;
    private static int count=1;
    public SaleRecord () {
        id = count;
        count++;
        total = quantity*1200;
        soldBitcoins = new BitcoinCatalog();
    }

    public Customer getInvestor() {
        return investor;
    }

    public void setInvestor(Customer investor) {
        this.investor = investor;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public BitcoinCatalog getSoldBitcoins() {
        return soldBitcoins;
    }

    public void setSoldBitcoins(BitcoinCatalog soldBitcoins) {
        this.soldBitcoins = soldBitcoins;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
