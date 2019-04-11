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
public class BitcoinAccountingPeopleDirectory {
    private ArrayList<BitcoinAccountingPeople> bitcoinAccountingPeopleDirectory;

    public BitcoinAccountingPeopleDirectory() {
        bitcoinAccountingPeopleDirectory = new ArrayList<>();
    }
    public ArrayList<BitcoinAccountingPeople> getBitcoinAccountingPeopleDirectory() {
        return bitcoinAccountingPeopleDirectory;
    }
    public BitcoinAccountingPeople createBitcoinAccountingPeople(String name){
        BitcoinAccountingPeople employee = new BitcoinAccountingPeople();
        employee.setName(name);
        bitcoinAccountingPeopleDirectory.add(employee);
        return employee;
    }
}
