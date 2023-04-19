/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory08Lab.Example3;

/**
 *
 * @author ali.nizam
 */
public class Staff implements IEmployee{
    int id;

    public Staff(int id) {
        this.id = id;
    }
    
    @Override
    public int getID() {
        return id;
    }
    
}
