/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ijse.mvc;

import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.view.itemForm;
import edu.ijse.mvc.view.OrderForm;
import javax.swing.WindowConstants;


/**
 *
 * @author ACER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        new itemForm().setVisible(true);
        
        new OrderForm().setVisible(true);
    }
    
}
