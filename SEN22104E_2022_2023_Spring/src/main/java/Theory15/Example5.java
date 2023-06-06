/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory15;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example5 {
    public static void main(String[] args) {
        try(RandomAccessFile file= new RandomAccessFile("c:\\files\\employees.txt", "r")) {
            file.seek(10);
            byte readed[]=new byte[10];
            file.read(readed);
            for (byte b : readed) {
                System.out.print((char)b);
            }
             
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Example5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Example5.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
}
