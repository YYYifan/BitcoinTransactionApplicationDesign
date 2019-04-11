/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkRequest;

import Bank.BankAccount;
import Bank.Customer;
import java.util.Date;

/**
 *
 * @author raunak
 */
public class BankWorkRequest {

    private int id;
    private static int count;
    private String message;
    private double total;
    
    private Customer sender;
    private String processor;
    private BankAccount bankAccount;
    
    private String status;
    private Date requestDate;
    private Date resolveDate;
    
    public BankWorkRequest(){
        requestDate = new Date();
        bankAccount = new BankAccount();
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Customer getSender() {
        return sender;
    }

    public void setSender(Customer sender) {
        this.sender = sender;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
}
