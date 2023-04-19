/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory08Lab.Example2;

/**
 *
 * @author ali.nizam
 */
public class MyComparison {
    static <T extends Employee> boolean compare(T object1, T object2){
       return object1.getId()==object2.getId(); 
    }
}
