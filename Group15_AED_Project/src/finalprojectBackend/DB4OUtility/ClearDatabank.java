/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.DB4OUtility;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.query.Query;

/**
 *
 * @author purka
 */
public class ClearDatabank {
    public static void main(String[] args) {
        // Path to the .db4o file
        String dbFilePath = "Databank.db4o";

        // Open the database
        ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), dbFilePath);

        try {
            // Query all objects
            Query query = db.query();
            query.constrain(Object.class); // Get all objects

            // Delete each object
            for (Object obj : query.execute()) {
                db.delete(obj);
            }

            // Commit changes
            db.commit();
            System.out.println("All data has been deleted from the database.");
        } finally {
            db.close(); // Always close the database
        }
    }
}

