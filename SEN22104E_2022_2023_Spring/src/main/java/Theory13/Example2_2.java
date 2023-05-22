/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example2_2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream file = new FileOutputStream("c:\\files\\Hello.txt");
        file.write('H');
        file.write('e');
        file.write('l');
        file.write('l');
        file.write('o');
        file.close();
    }
 
}
