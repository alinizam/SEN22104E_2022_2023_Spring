/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory02;

/**
 *
 * @author ali.nizam
 */
public class Customer {
    int id;

    public Customer(int id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }
    String firstName;

    @Override
    public String toString() {
        return firstName; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
