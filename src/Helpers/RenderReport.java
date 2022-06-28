/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

/**
 *
 * @author USER
 */

import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport; 
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.view.JasperViewer;

public class RenderReport {
    public void create() throws JRException {
        Connection conn = Helpers.DB.getConnection();
        String file = "bukti_registrasi.jasper";
        
        HashMap param = new HashMap();
        //JasperReport jasper = JasperCompileManager.compileReport(file, param, conn);
        try {
            JasperPrint jp = JasperFillManager.fillReport(getClass().getResourceAsStream(file), param, conn);
            JasperViewer.viewReport(jp, false);
        } catch( JRException ex) {
            Helpers.Dialog.createDialog(ex.getMessage(), new JFrame());
        }
    }
    
    public static void main (String[] args) throws JRException {
        new RenderReport().create();
    }
}
