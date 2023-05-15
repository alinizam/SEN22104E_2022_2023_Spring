/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory12;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;

/**
 *
 * @author ali.nizam
 */
public class Example4 {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("CPII_PE");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        Employee e=new Employee();
        e.setEmployeeId(50);
        e.setFirstName("Ahmet");
        e.setLastName("AK AK");
        e.setSalary(11111);
        em.persist(e);
        em.getTransaction().commit();
        em.close();
        emf.close();
        
    }
            
}
