/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

/**
 *
 * @author hp
 */
public class ConvertArgument {
    public static String booleanSample (Boolean source, String firstArg, String secondArg) {
        // args[] = ["Lunas", "Belum Lunas"]
        if ( source ) {
            return firstArg; // Lunas
        } else {
            return secondArg; // Belum Lunas
        }
    }
            
     public static String nullSample (String source, String firstArg) {
         if ( source == null || source.equals("null") ) {
             return firstArg;
         } else {
            return source;
         }
     }       
}
