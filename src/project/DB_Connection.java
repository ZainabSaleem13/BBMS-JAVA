/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author IMRAN
 */
public class DB_Connection {
    public static Connection getconn() {
        
        try {
            // TODO code application logic here
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=Blood Bank Management System","hello","12345");
            return connection;
            
            //System.out.println("Successfull");
        } catch (Exception e) {
            System.out.println(e);        
        }
        return null;
        
    }
    
    
}
