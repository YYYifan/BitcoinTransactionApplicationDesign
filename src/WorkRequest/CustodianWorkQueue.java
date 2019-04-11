/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkRequest;

import WorkRequest.InvestorWorkRequest;
import Bank.*;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class CustodianWorkQueue {
    
    private ArrayList<InvestorWorkRequest> workRequestList;

    public CustodianWorkQueue() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<InvestorWorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}