/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory14;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example1 {
    public static void main(String[] args) {
        try (PrintWriter file=new PrintWriter("c:\\files\\format.txt")) {
            file.format("Document No %08d %n", 1);
            file.format("Document No %08d %n", 100);
            file.format("Document No %08d %n", 116516);
            
            file.format("Document No %08.2f %n", 116516.0);
            file.format("Document No %08.1f %n", 116516.5150);
            file.format("%s %f %n", "Document No",116516.50);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Example1.class.getName()).log(Level.SEVERE, null, ex);
        }
      
                
    }
}
