/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example4 {
    public static void main(String[] args) {
        try {
            Reader file=new FileReader("c:\\files\\Hello.txt") ;
            int c;
            while((c=file.read())!=-1){
                System.out.println((char)c);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Example4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Example4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
