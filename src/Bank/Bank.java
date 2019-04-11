/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

import java.util.ArrayList;

/**
 *
 * @author owner
 */
public class Bank {
    private String name;
    private int id;
    private static int count = 1;
    private ArrayList<BankAccount> bankAccountList;
//    private BankAccountingPeopleDirectory bankAccoutingPeopleDirectory;
//    private CustomerDirectory customerDirectory;
    public Bank () {
        id = count;
        count++;
        bankAccountList = new ArrayList<>();
//        bankAccoutingPeopleDirectory = new BankAccountingPeopleDirectory();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<BankAccount> getBankAccountList() {
        return bankAccountList;
    }

    public void setBankAccountList(ArrayList<BankAccount> bankAccountList) {
        this.bankAccountList = bankAccountList;
    }

//    public CustomerDirectory getCustomerDirectory() {
//        return customerDirectory;
//    }
//
//    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
//        this.customerDirectory = customerDirectory;
//    }
//    
    @Override
    public String toString () {
        return name;
    }
}
