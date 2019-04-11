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
public class FeeTransactionDirectory {
    private ArrayList<FeeTransaction> feeTransactionDirectory;

    public ArrayList<FeeTransaction> getFeeTransactionDirectory() {
        return feeTransactionDirectory;
    }

    public void setFeeTransactionDirectory(ArrayList<FeeTransaction> feeTransactionDirectory) {
        this.feeTransactionDirectory = feeTransactionDirectory;
    }
    
    public FeeTransaction createFeeTransaction(String seller, String buyer, Date date, double fee){
        FeeTransaction tran = new FeeTransaction();
        tran.setSeller(seller);
        tran.setBuyer(buyer);
        tran.setDate(date);
        tran.setFee(fee);
        feeTransactionDirectory.add(tran);
        return tran;
    }
    
    public FeeTransaction searchTransaction(int id){
        for(FeeTransaction fTransaction : feeTransactionDirectory){
            if(fTransaction.getTid() == id){
                  return fTransaction;
            }
        }
        return null;
    }
}
