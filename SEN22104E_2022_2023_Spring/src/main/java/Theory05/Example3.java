/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory05;

/**
 *
 * @author ali.nizam
 */
public class Example3 {
    public static void main(String[] args) {
        String a="Ahmet";
        a="Mehmet";
        String b="Mehmet";
        System.out.println(a);
        System.out.println(a==b);
        
        Employee employee=new Employee();
        employee.firstName="Ayşe";
        changeObject(employee);
        System.out.println(employee.firstName);
        
        String name=new String("Ayşe");
        changeObject(name);
        System.out.println(name);
        
    }
    static void changeObject(Employee e){
        e.firstName="Ahmet";
    }
    static void changeObject(String e){
        e="Ahmet";
    }
}
