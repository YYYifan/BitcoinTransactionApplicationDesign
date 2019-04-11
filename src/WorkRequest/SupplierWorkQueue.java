/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkRequest;

import java.util.ArrayList;

/**
 *
 * @author owner
 */
public class SupplierWorkQueue {
    private ArrayList<InvestorWorkRequest> workRequestList;

    public SupplierWorkQueue() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<InvestorWorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}
