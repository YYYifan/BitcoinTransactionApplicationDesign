/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Government;

import java.util.ArrayList;

/**
 *
 * @author owner
 */
public class TransactionFeeDirectory {
     private ArrayList<TransactionFeetoGovernment> transactionFeeDirectory;
    
    public TransactionFeeDirectory() {
        transactionFeeDirectory = new ArrayList<>();
    }

    public ArrayList<TransactionFeetoGovernment> getBankDirectory() {
        return transactionFeeDirectory;
    }
    
    public TransactionFeetoGovernment searchTaxer (String name){
        for(TransactionFeetoGovernment tFee : transactionFeeDirectory){
            if(tFee.getTaxerName()== name){
                  return tFee;
            }
        }
        return null;
    }
}
