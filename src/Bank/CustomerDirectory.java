/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

import java.util.ArrayList;
import Bank.BankAccount;
import Bank.Customer;
/**
 *
 * @author owner
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerDirectory;
    public CustomerDirectory() {
        customerDirectory = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    public Customer createCustomer(String name, String ssn, String email, String bankUsername, String bankPassword, String bitcoinUsername, String bitcoinPassword){
        Customer employee = new Customer();
        employee.setName(name);
        employee.setEmail(email);
        employee.setSsn(ssn);
        employee.setBankusername(bankUsername);
        employee.setBankpassword(bankPassword);
        employee.setBitcoinusername(bitcoinUsername);
        employee.setBitcoinpassword(bitcoinPassword);
        customerDirectory.add(employee);
        return employee;
    }
}
