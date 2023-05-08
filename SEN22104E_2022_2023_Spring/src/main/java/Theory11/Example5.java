/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory11;

import static Theory11.Example3.insertData;
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
public class Example5 {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:derby://localhost:1527/sample";
        Connection c = DriverManager.getConnection(url, "app", "app");
      //  c.setAutoCommit(false);
        changeData(c);
       // c.commit();
    }

    static void changeData(Connection c) throws SQLException {
        Statement s = c.createStatement();
        int effectedRowNumber = s.executeUpdate("UPDATE employee "
                + " SET first_name='AYŞE AYŞE'  "
                + " WHERE employee_id=10");
        System.out.println("effectedRowNumber = " + effectedRowNumber);        
        Statement sQuery = c.createStatement();        
        ResultSet rs = sQuery.executeQuery("SELECTnn first_name FROM employee WHERE employee_id=10");
        if (rs.next()) {
            System.out.println(rs.getString(1));
        }
    }
}
