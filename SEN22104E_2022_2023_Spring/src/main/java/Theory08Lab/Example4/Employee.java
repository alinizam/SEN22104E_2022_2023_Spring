/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory08Lab.Example4;

/**
 *
 * @author ali.nizam
 */
public class Employee implements IComperable<Employee>{
    int id;
    @Override
    public boolean compare(Employee targetObject) {
       return id==targetObject.id;
    }
    
}
