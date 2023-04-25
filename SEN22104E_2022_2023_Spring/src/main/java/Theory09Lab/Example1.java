/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory09Lab;

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
        String url = "jdbc:derby://localhost:1527/sample";
        String userName = "app";
        String password = "app";
        try {
            Connection con = DriverManager.getConnection(url, userName, password);
            Statement s = con.createStatement();
            String sqlString = "SELECT * FROM customer";
            ResultSet rs = s.executeQuery(sqlString);
            while (rs.next()) {
                System.out.println(rs.getInt("customer_id")+" "+rs.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Example1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
