/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory14;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example6 {
     public static void main(String[] args) {
        storeObjectArray();
        
    }
     
     static void storeObjectArray(){
      String fileAddress="c:\\files\\carsObjectArray.object";
        try(ObjectOutputStream file=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileAddress)))) {
           Car[] cars={new Car(100000, "Togg TC1"),new Car(500000, "Togg TC2"),new Car(1000000, "Togg TC3")};
           file.writeObject(cars);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Example5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Example5.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
      static void storeObjectArrayList(){
           String fileAddress="c:\\files\\carsObject.object";
        try(ObjectOutputStream file=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileAddress)))) {
            ArrayList<Car> cars=new ArrayList<>();
            cars.add(new Car(100000, "Togg TC1"));
            cars.add(new Car(500000, "Togg TC2"));
            cars.add(new Car(1000000, "Togg TC3"));
            file.writeObject(cars);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Example5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Example5.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
}
