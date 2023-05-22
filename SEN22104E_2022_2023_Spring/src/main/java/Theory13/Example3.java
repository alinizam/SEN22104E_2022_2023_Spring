/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example3 {

    public static void main(String[] args) {

        try ( FileInputStream source = new FileInputStream("c:\\files\\Hello.txt");  
              FileOutputStream target = new FileOutputStream("c:\\files\\HelloAgain.txt")) {
            int i;
            while ((i = source.read()) != -1) {
                System.out.println((char) i + " - " + i);
                target.write(i);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Example3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Example3.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
