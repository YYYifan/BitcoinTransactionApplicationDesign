/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bitcoin;

import Bank.Customer;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author owner
 */
public class MatchPairDirectory {
    private ArrayList<MatchPair> matchPairDirectory;
    public MatchPairDirectory() {
        matchPairDirectory = new ArrayList<>();
    }

    public ArrayList<MatchPair> getMatchPairDirectory() {
        return matchPairDirectory;
    }
    public MatchPair createMatchPair ( String seller, String buyer, int quantity, int buyerQuantity, double total, Date date, String status, String buyerStatus) {
        MatchPair matchPair = new MatchPair();
        
        matchPair.setSeller(seller);
        matchPair.setBuyer(buyer);
        matchPair.setQuantity(quantity);
        matchPair.setBuyerQuantity(buyerQuantity);
        matchPair.setTotal(total);
        matchPair.setDate(date);
        matchPair.setStatus(status);
        matchPair.setBuyerStatus(buyerStatus);
        matchPairDirectory.add(matchPair);
        return matchPair;
    }
    public MatchPair searchMatchPair(int id){
        for(MatchPair matchPair : matchPairDirectory){
            if(matchPair.getId() == id){
               return matchPair; 
            }
        }
        return null;
    }
}
