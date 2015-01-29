/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author admin
 */
public class DBManager {
    private  Connection connection=null;
    private static DBManager singletonObj=null;
    private DBManager(){
    }
    public  static DBManager getInstance(){
        if(singletonObj == null){
            singletonObj=new DBManager();
        }
        return singletonObj;
    }
    
        /*
         * The method creates a Connection object. Loads the embedded driver,
         * starts and connects to the database using the connection URL.
         */
    public static Connection createDatabaseConnection()
                throws SQLException, ClassNotFoundException {
                String driver = "org.apache.derby.jdbc.EmbeddedDriver";
                Class.forName(driver);
                String url = "jdbc:derby:Assets\\dbheleper;create=true;user=padam;password=padam";
                Connection c = DriverManager.getConnection(url);
                return c;
    }
}
