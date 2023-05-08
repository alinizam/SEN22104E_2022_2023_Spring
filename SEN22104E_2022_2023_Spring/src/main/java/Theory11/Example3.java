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
public class Example3 {
    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527/sample";
        try ( Connection c = DriverManager.getConnection(url, "app", "app")) {
            
             insertData(c);
        } catch (SQLException ex) {
            Logger.getLogger(Example2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    static void changeData(Connection c) throws SQLException{
         Statement s=c.createStatement();
            int effectedRowNumber=s.executeUpdate("UPDATE employee "
                    + " SET first_name='MEHMET'  "
                    + " WHERE employee_id=3") ;
            System.out.println("effectedRowNumber = "+ effectedRowNumber); 
    }
    
    static void deleteData(Connection c) throws SQLException{
         Statement s=c.createStatement();
            int effectedRowNumber=s.executeUpdate("DELETE FROM employee "
                    + " WHERE employee_id>=2") ;
            System.out.println("effectedRowNumber = "+ effectedRowNumber); 
    }
    
    static void insertData(Connection c) throws SQLException{
            PreparedStatement ps=c.prepareStatement("INSERT INTO employee "
                   + "(employee_id,first_name,last_name,dept_id)"
                   + "VALUES"
                   +"(?,?,?,?)");
            ps.setInt(1, 11);
            ps.setString(2, "FATMA");
            ps.setString(3, "AK");
            ps.setInt(4, 1);
            int effectedRowNumber=ps.executeUpdate(); 
           
        System.out.println("effectedRowNumber = "+ effectedRowNumber); 
    }
}
