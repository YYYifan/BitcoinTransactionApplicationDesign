/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bitcoin;

import Bank.Customer;

/**
 *
 * @author owner
 */
public class Investor {
    private String name;
    private int id;
    private static int count=1;
    
    private Customer customer;
    private String username;
    private String password;
    
    private BitcoinCatalog wallet;
    private double balance;
//    private TransactionDirectory transactionRecords;
    
    public Investor() {
        id = count;
        count++;
        wallet = new BitcoinCatalog();
        
//        transactionRecords = new TransactionDirectory();
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BitcoinCatalog getWallet() {
        return wallet;
    }

    public void setWallet(BitcoinCatalog wallet) {
        this.wallet = wallet;
    }

//    public TransactionDirectory getTransactionRecords() {
//        return transactionRecords;
//    }
//
//    public void setTransactionRecords(TransactionDirectory transactionRecords) {
//        this.transactionRecords = transactionRecords;
//    }
//    
}
