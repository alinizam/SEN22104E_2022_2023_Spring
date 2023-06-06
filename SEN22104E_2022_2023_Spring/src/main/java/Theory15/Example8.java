/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author ali.nizam
 */
public class Example8 {
    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("c:\\files"), new MyFileVisitor());
       
    }
}
