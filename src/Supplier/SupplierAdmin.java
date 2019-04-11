/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Supplier;

import Bitcoin.Bitcoin;
import java.util.ArrayList;

/**
 *
 * @author owner
 */
public class SupplierAdmin {
    private String name;
    private int id;
    private static int count = 1;
    
    private String username;
    private String password;
    private ArrayList<Bitcoin> bitcoinList;
    public SupplierAdmin () {
        id = count;
        count++;
        bitcoinList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
                            @Override
    public String toString() {
        return name;
    }

    public ArrayList<Bitcoin> getBitcoinList() {
        return bitcoinList;
    }

    public void setBitcoinList(ArrayList<Bitcoin> bitcoinList) {
        this.bitcoinList = bitcoinList;
    }
    
    public void SupplyerBitcoinCreation(int range){    
        for(int i = 1; i <= range; i++ ){
            Bitcoin bc = new Bitcoin();
            bc.setValue(1200.00);
            bc.setId(i*100+i);
            bitcoinList.add(bc);
        }
    } 
}
