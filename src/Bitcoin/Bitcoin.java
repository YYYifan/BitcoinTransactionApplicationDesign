/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bitcoin;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author owner
 */
public class Bitcoin {
    private int id;
    private static int count=1;
    private double value;
    private ArrayList<Ownership> movements;
    
    public Bitcoin() {
        id = count;
        count++;
        movements = new ArrayList<>();
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Ownership> getMovements() {
        return movements;
    }

    public void setMovements(ArrayList<Ownership> movements) {
        this.movements = movements;
    }
    
    public Ownership createOwnership(String from, String to, int fid, int tid, Date date) {
        Ownership os = new Ownership();
        os.setDate(date);
        os.setFid(fid);
        os.setFrom(from);
        os.setOid(tid);
        os.setTo(to);
        movements.add(os);
        return os;
    }
    public Ownership searchOwnership (int id){
        for(Ownership os : movements){
            if(os.getOid() == id){
                  return os;
            }
        }
        return null;
    }
}
