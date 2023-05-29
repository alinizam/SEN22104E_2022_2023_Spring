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
public class Example7 {
    public static void main(String[] args) {
        storeNestedObject();
        
    }
    
    static void storeNestedObject(){
      String fileAddress="c:\\files\\nested.object";
        try(ObjectOutputStream file=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileAddress)))) {
        //   Driver drivers[]=new Driver[]{new Driver("Ahmet"),new Driver("Ayşe")};
            Car c=new Car(100, "Togg", new Driver[]{new Driver("Ahmet"),new Driver("Ayşe")});
            file.writeObject(c);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Example5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Example5.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}
