/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory13Lab;

import Theory12.Employee;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author ali.nizam
 */
public class Example3 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CPII_PE");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("Select e From Employee e");
        List<Employee> employees = q.getResultList();
        try ( BufferedWriter br = new BufferedWriter(new FileWriter("c:\\files\\employees.txt"))) {

            for (Employee employee : employees) {
                br.write(employee.getEmployeeId() +" " +employee.getFirstName()+" "+ employee.getSalary());;
                br.newLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(Example3.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
