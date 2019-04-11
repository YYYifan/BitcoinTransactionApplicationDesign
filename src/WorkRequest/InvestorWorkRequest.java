/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkRequest;

import Bank.Customer;
import Bitcoin.Investor;
import java.util.Date;

/**
 *
 * @author raunak
 */
public class InvestorWorkRequest {

    private String message;
    
    private Customer sender;
    private String request;
    private int quantity;
    
    private String status;
    private Date requestDate;
    private Date resolveDate;
    
    public InvestorWorkRequest(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Customer getSender() {
        return sender;
    }

    public void setSender(Customer sender) {
        this.sender = sender;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
