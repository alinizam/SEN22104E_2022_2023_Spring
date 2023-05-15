/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory12;

import java.sql.Connection;
import java.sql.DriverManager;
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
        Connection con=null;
        try{ 
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            con.setAutoCommit(false);
            Statement s=con.createStatement();
            s.executeUpdate("UPDATE employee SET salary=250000 WHERE employee_id=1");
            s.executeUpdate("UPDATE employee SET salary='1' WHERE employee_id=2");
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
