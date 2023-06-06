/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory15;

import java.awt.BorderLayout;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author ali.nizam
 */
public class Example1 {
    public static void main(String[] args) throws IOException {
        Path p=Paths.get("c:\\files\\hello.txt");
        System.out.println(Files.exists(p));
        System.out.println(Files.notExists(p));
        System.out.println(Files.isHidden(p)); 
        
    }
}
