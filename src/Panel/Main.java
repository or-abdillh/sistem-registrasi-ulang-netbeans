/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panel;

// Import all panels

import Panel.UserPanel.MainForm;

import Helpers.Connect;
import java.sql.Connection;
import java.sql.Statement;


// import sistemRegistrasiUlang.UserPanel.*;

/**
 *
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        Panel.Home.MainForm homePanel = new Panel.Home.MainForm();
        
        //AdminPanel.setVisible(true);
        homePanel.setVisible(true);
        Connection conn = Connect.getConnection();
    }
    
}
