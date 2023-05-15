/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example3 {
     public static void main(String[] args) {
        Connection con=null;
        try{ 
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            con.setAutoCommit(false);
            Statement s=con.createStatement();
            ResultSet rs=s.executeQuery("SELECT * FROM employee");
            ResultSetMetaData rsMD=rs.getMetaData();
            for (int i = 1; i <= rsMD.getColumnCount(); i++) {
                System.out.println(rsMD.getColumnLabel(i));
            }
            
            s.close();
            con.commit();
        } catch (SQLException ex) {
            Logger.getLogger(Example1.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (con!=null)
                
                try {
                    con.rollback();
                    con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Example1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         
         
    }
}
