/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Connect {
    public static Connection getConnection() throws ClassNotFoundException {
        
        // Frame
        JFrame connectFrame = new JFrame();
        
        
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/registrasi_ulang";
        String user="root";
        String password="";
        Class.forName("com.mysql.jdbc.Driver");
        
        try {
            conn = (Connection) DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(connectFrame, "Connection Success");
        } catch (SQLException e){    
            JOptionPane.showMessageDialog(connectFrame, "Connection Error \n " + e.getMessage());
        }
        return conn;
    }
    
    public static void main (String[] args) throws ClassNotFoundException {
        Statement statement = (Statement) Connect.getConnection();
    }
}
