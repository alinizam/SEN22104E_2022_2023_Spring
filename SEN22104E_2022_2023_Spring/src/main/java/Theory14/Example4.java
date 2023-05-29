/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory14;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example4 {
     public static void main(String[] args) {
        String fileAddress="c:\\files\\data.dat";
      //try (DataOutputStream file=new DataOutputStream(new FileOutputStream(fileAddress))){
        try (DataOutputStream file=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileAddress)))){
            file.writeUTF("Ahmet");
            file.writeInt(10);
            file.writeUTF("Mehmet");
            file.writeInt(50);
            file.writeUTF("Ayşe");
            file.writeInt(8);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Example3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Example3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
