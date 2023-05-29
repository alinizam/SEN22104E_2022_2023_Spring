/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory14;

import java.io.Serializable;

/**
 *
 * @author ali.nizam
 */
public class Car implements Serializable{
    int price;
    String model;
    Driver drivers[];

    public Car(int price, String model) {
        this.price = price;
        this.model = model;
    } 

    public Car(int price, String model, Driver[] drivers) {
        this.price = price;
        this.model = model;
        this.drivers = drivers;
    }
    
    
          
}
