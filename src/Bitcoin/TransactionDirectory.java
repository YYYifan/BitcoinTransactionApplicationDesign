/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bitcoin;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author owner
 */
public class TransactionDirectory {
    private ArrayList<Transaction> transactionDirectory;
    
    public TransactionDirectory() {
        transactionDirectory = new ArrayList<>();
    }

    public ArrayList<Transaction> getTransactionDirectory() {
        return transactionDirectory;
    }
    public Transaction searchTransaction(int id){
        for(Transaction transaction : transactionDirectory){
            if(transaction.getTid() == id){
                  return transaction;
            }
        }
        return null;
    }
    public Transaction createTransaction(String seller, String buyer, Date date, int quantity, String taxStatus, String feeStatus){
        Transaction tran = new Transaction();
        tran.setSeller(seller);
        tran.setBuyer(buyer);
        tran.setDate(date);
        tran.setQuantity(quantity);
        tran.setTaxStatus(taxStatus);
        tran.setFeeStatus(feeStatus);
        
        transactionDirectory.add(tran);
        return tran;
    }
}
