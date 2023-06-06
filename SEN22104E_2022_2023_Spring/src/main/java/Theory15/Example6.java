/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory15;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example6 {
    public static void main(String[] args) {
        try(RandomAccessFile file= new RandomAccessFile("c:\\files\\employees.txt", "rw")) {
            file.seek(10);
            String lastName="Hello";
            
            file.writeBytes(lastName);
            
             
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Example5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Example5.class.getName()).log(Level.SEVERE, null, ex);
        }
              
    }
}
