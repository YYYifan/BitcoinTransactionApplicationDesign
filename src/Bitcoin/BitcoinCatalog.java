/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bitcoin;

import java.util.ArrayList;

/**
 *
 * @author owner
 */
public class BitcoinCatalog {
    private ArrayList<Bitcoin> bitcoinCatalog;
    public BitcoinCatalog() {
        bitcoinCatalog = new ArrayList<>();
    }

    public ArrayList<Bitcoin> getBitcoinCatalog() {
        return bitcoinCatalog;
    }

    public Bitcoin createBitcoin (int id) {
        Bitcoin bitcoin = new Bitcoin();
        bitcoin.setId(id);
        bitcoinCatalog.add(bitcoin);
        return bitcoin;
    }
    public Bitcoin searchBitcoin(int id){
        for(Bitcoin bitcoin : bitcoinCatalog){
            if(bitcoin.getId() == id){
               return bitcoin; 
            }
        }
        return null;
    }
}
