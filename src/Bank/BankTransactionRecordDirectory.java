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
public class BankTransactionRecordDirectory {
    private ArrayList<BankTransactionRecord> fundsTransactionDirectory;
    
    public BankTransactionRecordDirectory() {
        fundsTransactionDirectory = new ArrayList<>();
    }

    public ArrayList<BankTransactionRecord> getFundsTransactionDirectory() {
        return fundsTransactionDirectory;
    }
    
   
    public BankTransactionRecord searchTransaction(int id){
        for(BankTransactionRecord fTransaction : fundsTransactionDirectory){
            if(fTransaction.getTid() == id){
                  return fTransaction;
            }
        }
        return null;
    }
}
