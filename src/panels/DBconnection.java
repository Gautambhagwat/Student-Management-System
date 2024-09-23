/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Natasha
 */
public class DBconnection {
    Connection con;
    
     public Connection getconnection(){
        
         try {
             
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=abcuni;user=sa;password=sa123";
            con=DriverManager.getConnection(url);
            
             
             
             
             
         } catch (Exception e) {
              JOptionPane.showMessageDialog(null,new String(" Error.." +e));
         }
         
         
         
         
         
         
         
         
         
         return con;
     
     
     
     
     
     
     
     
     }
    
    
    
    
    
}
