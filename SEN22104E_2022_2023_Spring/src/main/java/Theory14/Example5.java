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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example5 {
    public static void main(String[] args) {
        String fileAddress="c:\\files\\carsObject.object";
        try(ObjectOutputStream file=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileAddress)))) {
            file.writeObject(new Car(100000, "Togg TC1"));
            file.writeObject(new Car(500000, "Togg TC2"));
            file.writeObject(new Car(1000000, "Togg TC3"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Example5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Example5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
