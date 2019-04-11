/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

import java.util.Date;

/**
 *
 * @author owner
 */
public class MasterCustomerDirectory {
    private CustomerDirectory masterCustomerDirectory;

    public MasterCustomerDirectory(CustomerDirectory masterCustomerDirectory) {
        masterCustomerDirectory = new CustomerDirectory();
    }

    public CustomerDirectory getMasterCustomerDirectory() {
        return masterCustomerDirectory;
    }
    public Customer searchCustomer (String name) {
        for (Customer ba : masterCustomerDirectory.getCustomerDirectory()) {
            if (ba.getName().equals(name))
                return ba;
        }
        return null;
    }
    public void removeCustomer (String name) {
        for (Customer ba : masterCustomerDirectory.getCustomerDirectory()) {
            if (ba.getName().equals(name))
                masterCustomerDirectory.getCustomerDirectory().remove(ba);
        }
    }
    
}
