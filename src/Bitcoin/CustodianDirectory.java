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
public class CustodianDirectory {
    private ArrayList<Custodian> custodianDirectory;
    public CustodianDirectory() {
        custodianDirectory = new ArrayList<>();
    }

    public ArrayList<Custodian> getCustodianDirectory() {
        return custodianDirectory;
    }

    public void setCustodianDirectory(ArrayList<Custodian> custodianDirectory) {
        this.custodianDirectory = custodianDirectory;
    }

    public Custodian createCustodian(String name, String username, String password){
        Custodian employee = new Custodian();
        employee.setName(name);
        employee.setUsername(username);
        employee.setPassword(password);
        custodianDirectory.add(employee);
        return employee;
    }
}
