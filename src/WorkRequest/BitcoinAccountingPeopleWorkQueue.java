/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkRequest;

import WorkRequest.InvestorWorkRequest;
import java.util.ArrayList;

/**
 *
 * @author owner
 */
public class BitcoinAccountingPeopleWorkQueue {
    private ArrayList<BankWorkRequest> workRequestList;
    
    public BitcoinAccountingPeopleWorkQueue() {
        workRequestList = new ArrayList<>();
    }
    public ArrayList<BankWorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}
