/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example2_1 {
    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527/sample";
        try ( Connection c = DriverManager.getConnection(url, "app", "app")) {
            int purchaseCost=500;
            String productCode="SW";
            String sql="SELECT * FROM product "
                    + "where product_code=?"
                    + " AND purchase_cost>?";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, productCode);
            ps.setInt(2, purchaseCost);
            System.out.println(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               
                    System.out.println(rs.getString("product_id") + " " + rs.getInt("purchase_cost"));
                 
            }
        } catch (SQLException ex) {
            Logger.getLogger(Example2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
