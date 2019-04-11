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
public class InvestorDirectory {
    private ArrayList<Investor> investorDirectory;
    public InvestorDirectory() {
        investorDirectory = new ArrayList<>();
    }

    public ArrayList<Investor> getInvestorDirectory() {
        return investorDirectory;
    }

    public void setInvestorDirectory(ArrayList<Investor> investorDirectory) {
        this.investorDirectory = investorDirectory;
    }

    public Investor createInvestor(String name){
        Investor employee = new Investor();
        employee.setName(name);
        investorDirectory.add(employee);
        return employee;
    }
}
