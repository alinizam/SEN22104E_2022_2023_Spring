/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory13;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example7 {
    public static void main(String[] args) {
        BufferedInputStream file = null;
        try {
            file = new BufferedInputStream(new FileInputStream("c:\\files\\hello.txt"));
            int i;
            while ((i = file.read()) != -1) {
                System.out.println((char)i);
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Example6.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Example6.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException ex) {
                    Logger.getLogger(Example6.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }
}
