/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory08Lab.Example4;

/**
 *
 * @author ali.nizam
 */
public class Car implements IComperable<Truck>{
    String model;

    @Override
    public boolean compare(Truck targetObject) {
         return this.model.equals(targetObject.model);
    }

   
   
    
}
