/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory12;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ali.nizam
 */
public class Example7 {
     public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CPII_PE");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Employee e = em.find(Employee.class, 50);
        e.setFirstName("Ahmet Kemal");
        em.getTransaction().commit();
        em.close();
        emf.close();

    }
}
