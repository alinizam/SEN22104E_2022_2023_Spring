/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory14;

import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Path;

/**
 *
 * @author ali.nizam
 */
public class Example10 {
    public static void main(String[] args) throws IOException {
        Path p=Paths.get("\\files\\a\\b");
        for (Path path : p) {
            System.out.println(p.toString());
        }
        System.out.println(p.toAbsolutePath());
        
        Path p1=Paths.get("c:\\..\\..\\files");
        System.out.println(p1.toRealPath());
        
        Path p2=Paths.get("C:\\files\\target\\a\\a1.txt");
        System.out.println(p2.toUri());

    }
}
