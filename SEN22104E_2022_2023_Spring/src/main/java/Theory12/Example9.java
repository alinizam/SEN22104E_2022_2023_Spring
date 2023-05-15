/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory12;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author ali.nizam
 */
public class Example9 {
      public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CPII_PE");
        EntityManager em = emf.createEntityManager();
        Query q=em.createNamedQuery("Employee.findAll");
        
        List<Employee> employees=q.getResultList();
        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeId()+" "+employee.getFirstName());
        }
        em.close();
        emf.close();

    }
}
