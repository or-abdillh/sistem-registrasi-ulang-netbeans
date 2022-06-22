/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/

package sistemRegistrasiUlang;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Connection {
    public static Connection getConnection(){
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/registrasi_ulang";
        String user="root";
        String password="";
        try {
            conn = (Connection) DriverManager.getConnection(url, user, password);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return conn;
    }
}
