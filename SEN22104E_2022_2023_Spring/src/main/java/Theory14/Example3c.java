/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory14;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example3c {
     public static void main(String[] args) {
        String fileAddress="c:\\files\\data.dat";
        try(DataInputStream file=new DataInputStream(new BufferedInputStream(new FileInputStream(fileAddress)))){
            try{
                while(true){
                    System.out.println(file.readInt());      
                }
            }
            catch(java.io.EOFException e){
                   System.out.println("Read all bytes"); 
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Example3b.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Example3b.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
