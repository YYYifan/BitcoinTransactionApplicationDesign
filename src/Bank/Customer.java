/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

import java.util.ArrayList;
import Bank.BankAccount;
import Bitcoin.BitcoinCatalog;
import WorkRequest.BankWorkRequest;

/**
 *
 * @author owner
 */
public class Customer {
    private String name;
    private int id;
    private static int count=1;
    
    private String email;
    private String ssn;
    private String bitcoinusername;
    private String bitcoinpassword;
    
    private String bankusername;
    private String bankpassword;
     
    private ArrayList<BankAccount> bankAccountList;
    private BitcoinCatalog wallet;
    private ArrayList<BankWorkRequest> workRequestList;
    
    private double BitcoinSystemBalance;
//    private FundsTransactionDirectory fTDir;
    public Customer () {
        id = count;
        count++;
        bankAccountList = new ArrayList<>();
        wallet = new BitcoinCatalog();
        workRequestList = new ArrayList<>();
    }

    public ArrayList<BankWorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public void setWorkRequestList(ArrayList<BankWorkRequest> workRequestList) {
        this.workRequestList = workRequestList;
    }

    public String getBitcoinusername() {
        return bitcoinusername;
    }

    public void setBitcoinusername(String bitcoinusername) {
        this.bitcoinusername = bitcoinusername;
    }

    public String getBitcoinpassword() {
        return bitcoinpassword;
    }

    public void setBitcoinpassword(String bitcoinpassword) {
        this.bitcoinpassword = bitcoinpassword;
    }

    public String getBankusername() {
        return bankusername;
    }

    public void setBankusername(String bankusername) {
        this.bankusername = bankusername;
    }

    public String getBankpassword() {
        return bankpassword;
    }

    public void setBankpassword(String bankpassword) {
        this.bankpassword = bankpassword;
    }


    public BitcoinCatalog getWallet() {
        return wallet;
    }

    public void setWallet(BitcoinCatalog wallet) {
        this.wallet = wallet;
    }

    public double getBitcoinSystemBalance() {
        return BitcoinSystemBalance;
    }

    public void setBitcoinSystemBalance(double BitcoinSystemBalance) {
        this.BitcoinSystemBalance = BitcoinSystemBalance;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public ArrayList<BankAccount> getBankAccountList() {
        return bankAccountList;
    }

    public void setBankAccountList(ArrayList<BankAccount> bankAccountList) {
        this.bankAccountList = bankAccountList;
    }
    @Override
    public String toString(){
        return name;
    }
    
}
