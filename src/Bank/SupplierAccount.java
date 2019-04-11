/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

import Supplier.SaleRecord;
import java.util.ArrayList;

/**
 *
 * @author owner
 */
public class SupplierAccount {
    private String accountnumber;
    private String bankname;
    private double balance;
    private ArrayList<SaleRecord> saleRecordList;
    
    public SupplierAccount () {
        saleRecordList = new ArrayList<>();
        accountnumber = "1234566";
        bankname = "Central Bank";
        balance = 0.0;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }




    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<SaleRecord> getSaleRecordList() {
        return saleRecordList;
    }

    public void setSaleRecordList(ArrayList<SaleRecord> saleRecordList) {
        this.saleRecordList = saleRecordList;
    }
    
}
