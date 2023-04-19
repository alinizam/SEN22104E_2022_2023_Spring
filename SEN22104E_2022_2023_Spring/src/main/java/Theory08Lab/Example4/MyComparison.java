/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory08Lab.Example4;
 

/**
 *
 * @author ali.nizam
 */
public class MyComparison {
    static <T extends IComperable<T>> boolean compare(T object1, T object2){
      return object1.compare(object2);
    }
}
