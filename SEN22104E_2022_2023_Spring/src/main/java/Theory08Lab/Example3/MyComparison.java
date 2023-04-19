/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory08Lab.Example3;

/**
 *
 * @author ali.nizam
 */
public class MyComparison {
    static <T extends IEmployee> boolean compare(T object1, T object2){
      return object1.getID()==object2.getID();
    }
}
