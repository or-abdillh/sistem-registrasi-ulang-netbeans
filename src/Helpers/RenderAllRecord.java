/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class RenderAllRecord {
    public static void show (JTable table) {
        // Create model
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("No");
        tableModel.addColumn("NIM");
        tableModel.addColumn("Nama");
        tableModel.addColumn("Prodi");
        tableModel.addColumn("Pembayaran");
        tableModel.addColumn("Status");
        tableModel.addColumn("Semester Registrasi");
        table.setModel(tableModel);
        
        // Remove all row
        tableModel.setNumRows(0);
        
        Connection conn = Helpers.Connect.getConnection();
        try {
            java.sql.Statement stmt = conn.createStatement();
            String SQL = "SELECT * FROM mahasiswa";
            java.sql.ResultSet results = stmt.executeQuery(SQL);
            // Loop results
            int index = 1;
            while ( results.next() ) {
                tableModel.addRow( new Object[]{
                    index++,
                    results.getString("nim"),
                    results.getString("nama"),
                    results.getString("program_studi"),
                    Helpers.ConvertToArgument.booleanSample(
                        results.getBoolean("status_pembayaran"), "Lunas", "Belum Lunas"
                    ),
                    Helpers.ConvertToArgument.booleanSample(
                        results.getBoolean("status_registrasi"), "Sudah", "Belum"
                    ),
                    Helpers.ConvertToArgument.nullSample(
                        results.getString("semester_register"), "Tidak ada data"
                    ),
                });
                // Resize width column
                table.getColumnModel().getColumn(0).setPreferredWidth(40); // No
                table.getColumnModel().getColumn(1).setPreferredWidth(100); // Nama
                table.getColumnModel().getColumn(2).setPreferredWidth(100); // Prodi
                table.getColumnModel().getColumn(3).setPreferredWidth(100); // NIM
                table.getColumnModel().getColumn(4).setPreferredWidth(100); // Pembayaran
                table.getColumnModel().getColumn(5).setPreferredWidth(100); // Registrasi
                table.getColumnModel().getColumn(6).setPreferredWidth(180); // Semester
            }
        } catch( SQLException  e ) {
            Helpers.ShowDialog.createDialog("Error : \n" + e.getMessage(), new JFrame());
        }
    }
}