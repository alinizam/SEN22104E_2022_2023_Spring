/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example8 {
    public static void main(String[] args) {
        
    }
    
    static void readFileTryWithResources(){
        try(FileReader f=new FileReader("c:\\files\\a.txt")){
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Example8.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Example8.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static void readFile(){
        FileReader f=null;
        try {
            f=new FileReader("c:\\files\\a.txt");
            f.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Example8.class.getName()).log(Level.SEVERE, null, ex);
            if (f!=null) try {
                f.close();
            } catch (IOException ex1) {
                Logger.getLogger(Example8.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (IOException ex) {
            Logger.getLogger(Example8.class.getName()).log(Level.SEVERE, null, ex);
            if (f!=null) try {
                f.close();
            } catch (IOException ex1) {
                Logger.getLogger(Example8.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
    
    
    }
}
