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
public class TaxTransactionDirectory {
    private ArrayList<TaxTransaction> taxTransactionDirectory;

    public ArrayList<TaxTransaction> getTaxTransactionDirectory() {
        return taxTransactionDirectory;
    }

    public void setTaxTransactionDirectory(ArrayList<TaxTransaction> taxTransactionDirectory) {
        this.taxTransactionDirectory = taxTransactionDirectory;
    }
    public TaxTransaction searchTransaction(int id){
        for(TaxTransaction fTransaction : taxTransactionDirectory){
            if(fTransaction.getTid() == id){
                  return fTransaction;
            }
        }
        return null;
    }
}
