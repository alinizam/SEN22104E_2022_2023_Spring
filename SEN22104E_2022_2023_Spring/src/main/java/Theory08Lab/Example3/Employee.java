/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory08Lab.Example3;

/**
 *
 * @author ali.nizam
 */
public class Employee implements IEmployee{
    int id;

    public Employee(int id) {
        this.id = id;
    }
    
    @Override
    public int getID() {
        return id;
    }
    
}
