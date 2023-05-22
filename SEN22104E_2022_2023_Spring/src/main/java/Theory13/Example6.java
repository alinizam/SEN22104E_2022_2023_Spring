/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example6 {

    public static void main(String[] args) {
        BufferedReader file = null;
        try {
            file = new BufferedReader(new FileReader("c:\\files\\hello.txt"));
            String line;
            while ((line = file.readLine()) != null) {
                System.out.println(line);
               
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
