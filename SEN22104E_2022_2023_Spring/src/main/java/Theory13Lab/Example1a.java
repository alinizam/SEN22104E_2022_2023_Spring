/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory13Lab;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example1a {
    public static void main(String[] args) {
        String s="Fatih Sultan Mehmet";
        try(FileOutputStream fos=new FileOutputStream("C:\\Files\\byte.txt")) {
            for(char c:s.toCharArray()){
                fos.write((byte)c);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Example1a.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Example1a.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
