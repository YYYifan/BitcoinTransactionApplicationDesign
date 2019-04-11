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
public class BankAccountingPeopleDirectory {
    private ArrayList<BankAccountingPeople> bankAPDirectory;

    public BankAccountingPeopleDirectory() {
        bankAPDirectory = new ArrayList<>();
    }
    public ArrayList<BankAccountingPeople> getBankAPDirectory() {
        return bankAPDirectory;
    }

    public void setBankAPDirectory(ArrayList<BankAccountingPeople> bankAPDirectory) {
        this.bankAPDirectory = bankAPDirectory;
    }
    public BankAccountingPeople createBankAccountingPeople(String name){
        BankAccountingPeople employee = new BankAccountingPeople();
        employee.setName(name);
        bankAPDirectory.add(employee);
        return employee;
    }
}
