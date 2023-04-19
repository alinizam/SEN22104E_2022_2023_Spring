/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory08Lab.Example2;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(MyComparison.compare(new Staff(1), new Employee(1)));
        System.out.println(MyComparison.<Employee>compare(new Staff(1), new Employee(1)));
       // System.out.println(MyComparison.compare(new Manager(), new Employee(1)));  //type check error
    }
}
