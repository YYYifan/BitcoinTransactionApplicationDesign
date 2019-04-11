/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Business;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;

/**
 *
 * @author Starrywing
 */
public class Db4oUtil {

    private static final String FILENAME = "Databank.db4o"; // path to the data store
    private static Db4oUtil dB4OUtil;

    public synchronized static Db4oUtil getInstance() {
        if (dB4OUtil == null) {
            dB4OUtil = new Db4oUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(Business.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(Business bitSystem) {
        ObjectContainer conn = createConnection();
        conn.store(bitSystem);
        conn.commit();
        conn.close();
    }

    public Business retrieveSystem() {
        ObjectContainer conn = createConnection();
        ObjectSet<Business> bitSystems = conn.query(Business.class); // Change to the object you want to save
        Business bitSystem;
        if (bitSystems.size() == 0) {
            bitSystem = ConfigureABusiness.configure();  // If there's no System in the record, create a new one
        } else {
            bitSystem = bitSystems.get(bitSystems.size() - 1);
        }
        conn.close();
        return bitSystem;
    }
}
