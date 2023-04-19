/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory08Lab.Example3;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        
        IEmployee e=new Employee(5);
        IEmployee s=new Staff(5);
        
        System.out.println(MyComparison.<IEmployee>compare(s, e));
    }
}
