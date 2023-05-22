/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory13;


import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example5 {
    public static void main(String[] args) {
        try(FileWriter file=new FileWriter("c:\\files\\Hello.txt",true)){
        char[] chars={'W','o','r','l','d'};  
        file.write(chars);
        } catch (IOException ex) {
            Logger.getLogger(Example5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
