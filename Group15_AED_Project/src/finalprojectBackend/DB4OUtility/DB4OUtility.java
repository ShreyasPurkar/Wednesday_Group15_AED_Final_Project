/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.DB4OUtility;

import finalprojectBackend.OperatingSystem.SystemConfig;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;



import java.nio.file.Paths;

/**
 *
 * @author manikhandan
 */
public class DB4OUtility {
    
    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();
    private static DB4OUtility dB4OUtil;
    
    public synchronized static DB4OUtility getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtility();
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
            ObjectContainer db = Db4oEmbedded.openFile(FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }


    public synchronized void storeSystem(OperatingSystem system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }
    
    public OperatingSystem retrieveSystem(){
        ObjectContainer conn = createConnection();
        ObjectSet<OperatingSystem> systems = conn.query( OperatingSystem.class); // Change to the object you want to save
        OperatingSystem system;
        if (systems.size() == 0){
            system = SystemConfig.configure();  // If there's no System in the record, create a new one
        }
        else{
            system = systems.get(systems.size() - 1);
        }
        conn.close();
        return system;
    }
}
