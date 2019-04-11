/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkRequest;

import WorkRequest.BankWorkRequest;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class BankAccountingPeopleWorkQueue {
    
    private ArrayList<BankWorkRequest> workRequestList;

    public BankAccountingPeopleWorkQueue() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<BankWorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}