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
public class BankDirectory {
    private ArrayList<Bank> bankDirectory;
    
    public BankDirectory() {
        bankDirectory = new ArrayList<>();
    }

    public ArrayList<Bank> getBankDirectory() {
        return bankDirectory;
    }
    public Bank createBank(String name) {
        Bank bank = new Bank();
        bank.setName(name);
        bankDirectory.add(bank);
        return bank;
    }
    public Bank searchBank (String name){
        for(Bank bank : bankDirectory){
            if(bank.getName() == name){
                  return bank;
            }
        }
        return null;
    }
    public void removeBank (Bank bank) {
        bankDirectory.remove(bank);
    }
}
