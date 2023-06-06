/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths; 
import java.nio.file.attribute.BasicFileAttributes;

/**
 *
 * @author ali.nizam
 */
public class Example4 {
    public static void main(String[] args) throws IOException {
        Path p1=Paths.get("c:\\files\\employees.txt");
        BasicFileAttributes attr=Files.readAttributes(p1, BasicFileAttributes.class);
        System.out.println(attr.creationTime());
        System.out.println(attr.isDirectory());
        
    }
}
