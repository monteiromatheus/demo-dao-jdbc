/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Date;
import model.entities.Department;
import model.entities.Seller;

/**
 *
 * @author Matheus
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Department obj = new Department(1,"Books");
        Seller seller = new Seller(1, "Bob", "bob@gmail.com",new Date(),3000.00,obj);
        System.out.println(seller);
    }
    
}
