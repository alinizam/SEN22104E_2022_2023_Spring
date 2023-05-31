/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory14Lab;

import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example2 {
    public static void main(String[] args) {
        Path p1=Paths.get("C:\\Files\\a\\try.txt");
        System.out.println(p1.getRoot());
        for (Path path1 : p1) {
            System.out.println(path1.toString());
            
        }
        for (int i = 1; i <= p1.getNameCount(); i++) {
            System.out.println(p1.getRoot().toString()+p1.subpath(0,i));
        }
        
         for (int i = 1; i <= p1.getNameCount(); i++) {
           Path subPath= Paths.get(p1.getRoot().toString()+p1.subpath(0,i));
            try {
                System.out.println(subPath.toRealPath());
            } catch (IOException ex) {
                Logger.getLogger(Example2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
    }
}
