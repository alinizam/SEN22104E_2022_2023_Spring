/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory14;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example6b {
     public static void main(String[] args) {
        String fileAddress="c:\\files\\carsObjectArray.object";
        try(ObjectInputStream file=new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileAddress)))){           
               //ArrayList<Car> cars=(ArrayList<Car>)file.readObject();
               Car[] cars=(Car[])file.readObject();
               for (Car car : cars) {
                   System.out.println(car.model+" "+car.price);
              }
             
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Example5b.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Example5b.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Example5b.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
}
