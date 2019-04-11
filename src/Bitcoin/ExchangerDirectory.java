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
public class ExchangerDirectory {
    private ArrayList<Exchanger> exchangerDirectory;
    public ExchangerDirectory() {
        exchangerDirectory = new ArrayList<>();
    }

    public ArrayList<Exchanger> getExchangerDirectory() {
        return exchangerDirectory;
    }

    public void setExchangerDirectory(ArrayList<Exchanger> exchangerDirectory) {
        this.exchangerDirectory = exchangerDirectory;
    }


    public Exchanger createExchanger(String name){
        Exchanger employee = new Exchanger();
        employee.setName(name);
        exchangerDirectory.add(employee);
        return employee;
    }
}
