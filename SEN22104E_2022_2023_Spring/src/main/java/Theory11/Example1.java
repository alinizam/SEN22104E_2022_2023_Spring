/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example1 {
    public static void main(String[] args) {
        String url="jdbc:derby://localhost:1527/sample";
        try {
            Connection c=DriverManager.getConnection(url,"app","app");
            Statement s=c.createStatement();
            ResultSet rs=s.executeQuery("SELECT * FROM product");
            while (rs.next()){
            
                System.out.println(rs.getString("product_id") +" " +rs.getInt("purchase_cost"));
            }
            
            ResultSet rsDept=s.executeQuery("SELECT * FROM department");
            while (rsDept.next()){
            
                System.out.println(rsDept.getString("dept_id") +" " +rsDept.getString("dept_name"));
            }
            System.out.println("Success");
        } catch (SQLException ex) {
            Logger.getLogger(Example1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
