/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author ali.nizam
 */
public class Example3 {
    public static void main(String[] args) throws IOException {
          Path p1=Paths.get("c:\\files\\b");
          Path p2=Paths.get("c:\\files\\a\\b");
          //Files.copy(p1, p2,StandardCopyOption.REPLACE_EXISTING);
          Files.move(p1, p2,StandardCopyOption.REPLACE_EXISTING);
          
          
          
    }
}
