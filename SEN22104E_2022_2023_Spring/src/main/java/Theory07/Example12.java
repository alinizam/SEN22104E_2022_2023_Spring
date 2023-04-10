/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory07;

/**
 *
 * @author ali.nizam
 */
public class Example12 {
    public static void main(String[] args) {
        Employee e=new Staff();
        Staff s=(Staff)(new Employee());
    }
    static class Employee{
    
    }
    static class Staff extends Employee{
    
    }
}
