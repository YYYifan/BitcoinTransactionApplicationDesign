/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

import java.util.Date;

/**
 *
 * @author owner
 */
public class BankAccount {
    private static int count=1;
    private int accountNumber;
    private String customerName;
    private double balance;
    private Date date;
    
    private String password;
    private String BankName;

    private Bank bank;
    private Customer customer;

    private BankTransactionRecordDirectory transactionRecordDirectory;
    
    public BankAccount() {

        balance = 0.00;
        date = new Date();
        customer = new Customer();
//        customerName = customer.getName();
        bank = new Bank();
        transactionRecordDirectory = new BankTransactionRecordDirectory();
        accountNumber = count + 1000*bank.getId();
        count++;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public Bank getBank() {
        return bank;
    }

//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public BankTransactionRecordDirectory getTransactionRecordDirectory() {
        return transactionRecordDirectory;
    }

    public void setTransactionRecordDirectory(BankTransactionRecordDirectory transactionRecordDirectory) {
        this.transactionRecordDirectory = transactionRecordDirectory;
    }
     

    
    @Override
    public String toString(){
        return customerName;
    }
    
}
