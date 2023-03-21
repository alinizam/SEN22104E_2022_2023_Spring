/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory04;

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

        readFile();
        try {
            readFileErrorSpecify();
        } catch (IOException ex) {
            Logger.getLogger(Example6.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    static void readFile() {
        //check
        try {
            FileReader f = new FileReader("c:\\Files\\A.txt");
            System.out.println("File opened.");
            int c = f.read();
            System.out.println((char) c);
            c = f.read();
            System.out.println((char) c);
            c = f.read();
            System.out.println((char) c);
            c = f.read();
            System.out.println((char) c);
            c = f.read();
            System.out.println((char) c);

        } catch (FileNotFoundException e) {
            System.out.println("File name is not correct");

        } catch (IOException ex) {
            Logger.getLogger(Example6.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
     static void readFileErrorSpecify() throws FileNotFoundException,IOException {
        
            FileReader f = new FileReader("c:\\Files\\A.txt");
            System.out.println("File opened.");
            int c = f.read();
            System.out.println((char) c);
            
    }
    
}
