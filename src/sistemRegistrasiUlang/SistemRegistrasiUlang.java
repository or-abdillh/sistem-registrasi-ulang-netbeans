/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemRegistrasiUlang;

// Import all panels

import sistemRegistrasiUlang.UserPanel.MainForm;

import Helpers.Connect;
import java.sql.Connection;
import java.sql.Statement;


// import sistemRegistrasiUlang.UserPanel.*;

/**
 *
 * @author hp
 */
public class SistemRegistrasiUlang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        sistemRegistrasiUlang.UserPanel.MainForm userPanel = new sistemRegistrasiUlang.UserPanel.MainForm();
        sistemRegistrasiUlang.Home.MainForm homePanel = new sistemRegistrasiUlang.Home.MainForm();
        
        //AdminPanel.setVisible(true);
        homePanel.setVisible(true);
        Connection conn = Connect.getConnection();
    }
    
}
