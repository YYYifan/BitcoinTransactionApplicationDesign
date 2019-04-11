/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Bank.BankAdmin;
import Bitcoin.BitcoinAdmin;
import Government.GovernmentAdmin;
import Supplier.SupplierAdmin;

/**
 *
 * @author owner
 */
public class ConfigureABusiness {
    public static Business configure(){
        
        Business business = Business.getInstance();
        
        business.getBankAdmin().setName("BankAdmin");
        business.getBankAdmin().setUsername("bbb");
        business.getBankAdmin().setPassword("hhh");
        
        business.getBitcoinAdmin().setName("BitcoinAdmin");
        business.getBitcoinAdmin().setUsername("ccc");
        business.getBitcoinAdmin().setPassword("hhh");
        
        business.getGovernmentAdmin().setName("GovernmentAdmin");
        business.getGovernmentAdmin().setUsername("ggg");
        business.getGovernmentAdmin().setPassword("hhh");
        
        business.getSupplierAdmin().setName("SupplierAdmin");
        business.getSupplierAdmin().setUsername("sss");
        business.getSupplierAdmin().setPassword("hhh");

        return business;
    }
}
