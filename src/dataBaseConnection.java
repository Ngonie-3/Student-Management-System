/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ngoni
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class dataBaseConnection {
    
    final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; //add .cj
    final static String DB_URL = "jdbc:mysql://localhost:3306/student";
    
    final static String USER = "root";
    final static String PASS = "p@55w0rd!";
    
    public static Connection connection(){
        
        try {
            Class.forName(JDBC_DRIVER);
            
            Connection conn = DriverManager.getConnection(DB_URL,USER, PASS);
            
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
