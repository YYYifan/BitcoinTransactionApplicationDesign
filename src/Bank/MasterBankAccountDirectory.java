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
public class MasterBankAccountDirectory {
    private ArrayList<BankAccount> bankAccountDirectory;
    
    public MasterBankAccountDirectory () {
        bankAccountDirectory = new ArrayList<BankAccount>();
    }

    public ArrayList<BankAccount> getBankAccountDirectory() {
        return bankAccountDirectory;
    }
    public BankAccount createBankAccout(String password, Date date, double balance, String bankName) {
        BankAccount ba = new BankAccount();
        ba.setBalance(balance);
        ba.setBankName(bankName);
        ba.setDate(date);
        ba.setPassword(password);
        bankAccountDirectory.add(ba);
       
        return ba;
    }
    public BankAccount searchBankAccount (int an) {
        for (BankAccount ba : bankAccountDirectory) {
            if (ba.getAccountNumber() == an)
                return ba;
        }
        return null;
    }
    public void removeBankAccount (int an) {
        for (BankAccount ba : bankAccountDirectory) {
            if (ba.getAccountNumber() == an)
                bankAccountDirectory.remove(ba);
        }
    }
}
