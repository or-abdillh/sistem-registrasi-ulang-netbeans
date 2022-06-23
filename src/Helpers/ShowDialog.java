/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class ShowDialog {
    public static void createDialog(String message, JFrame frame) {
        JOptionPane.showMessageDialog(frame, message);
    }
}
