/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory14Lab;

import Theory12.Employee;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
public class Example1 {
    public static void main(String[] args) {
       
       // createFiles();
        readFilesAndUpdateSalary();
        
    }
    static void createFiles(){
     EntityManagerFactory emf = Persistence.createEntityManagerFactory("CPII_PE");
        EntityManager em = emf.createEntityManager();
        Query qEmployee = em.createQuery("Select e From Employee e");
        Query qSalary = em.createQuery("Select s From Salaries s Where s.employeeId=:pEmpId");
        List<Employee> employees=qEmployee.getResultList();
        for (Employee employee : employees) {
         String fileAddress="c:\\files\\target\\"+employee.getEmployeeId()+".dat";
            try(DataOutputStream file=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileAddress)))){
                qSalary.setParameter("pEmpId", employee.getEmployeeId());
                List<Salaries> salaries=qSalary.getResultList();
                for (Salaries salary : salaries) {
                    file.writeInt(salary.getSalary());
                }
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Example1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Example1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }
    
     static void readFilesAndUpdateSalary(){
     EntityManagerFactory emf = Persistence.createEntityManagerFactory("CPII_PE");
        EntityManager em = emf.createEntityManager();
        Query qEmployee = em.createQuery("Select e From Employee e");
        
        List<Employee> employees=qEmployee.getResultList();
        for (Employee employee : employees) {
         String fileAddress="c:\\files\\target\\"+employee.getEmployeeId()+".dat";
            try(DataInputStream file=new DataInputStream(new BufferedInputStream(new FileInputStream(fileAddress)))){
                int totalSalary=0;
                 
                while(file.available()>0){
                    totalSalary+=file.readInt();
                }
                em.getTransaction().begin();
                Employee e=em.find(Employee.class, employee.getEmployeeId());
                e.setSalary(totalSalary);
                em.getTransaction().commit();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Example1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Example1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }
}
