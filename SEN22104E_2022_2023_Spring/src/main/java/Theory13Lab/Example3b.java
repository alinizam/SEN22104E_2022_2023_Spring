/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory13Lab;

import Theory12.Employee;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author ali.nizam
 */
public class Example3b {
     public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CPII_PE");
        EntityManager em = emf.createEntityManager();
         
     
        try ( BufferedReader br = new BufferedReader(new FileReader("c:\\files\\employees.txt"))) {
            String line;
            em.getTransaction().begin();
            while ((line=br.readLine())!=null){
                String empInfo[]=line.split(" ");
                Employee e=new Employee();
                e.setEmployeeId(Integer.parseInt(empInfo[0]));
                e.setFirstName(empInfo[1]);
                e.setLastName("AK");
                e.setSalary(Integer.parseInt(empInfo[0]));
                em.persist(e);
            }
            em.getTransaction().commit();
            
        } catch (IOException ex) {
            Logger.getLogger(Example3.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
