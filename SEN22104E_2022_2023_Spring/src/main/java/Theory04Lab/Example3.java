/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory04Lab;

/**
 *
 * @author ali.nizam
 */
public class Example3 {

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0]=new Employee(10000);
        employees[1] = null;
        employees[2]= new Employee(5000);
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            try {
                sum+=employees[i].salary;
                
            } catch (Exception e) {
                employees[i]=new Employee(0);
            }
            
        }
        System.out.println("Total = "+sum);
    }
}
