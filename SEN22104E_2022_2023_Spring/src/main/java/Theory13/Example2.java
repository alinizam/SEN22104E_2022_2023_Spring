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
public class Example2 {
    public static void main(String[] args) {
        try(FileOutputStream file = new FileOutputStream("c:\\files\\Hello.txt")) {
            file.write('g');
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Example2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Example2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
