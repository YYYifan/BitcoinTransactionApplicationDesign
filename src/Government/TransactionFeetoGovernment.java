/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Government;

import java.util.Date;

/**
 *
 * @author owner
 */
public class TransactionFeetoGovernment {
    private Date date;
    private int feeValue;
    private int id;
    private static int count = 1;
    private String taxerName;
    public TransactionFeetoGovernment(){
        id = count;
        count++;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getFeeValue() {
        return feeValue;
    }

    public void setFeeValue(int feeValue) {
        this.feeValue = feeValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaxerName() {
        return taxerName;
    }

    public void setTaxerName(String taxerName) {
        this.taxerName = taxerName;
    }
    
}
