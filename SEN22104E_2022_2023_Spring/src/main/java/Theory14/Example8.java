/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory14;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author ali.nizam
 */
public class Example8 {
    public static void main(String[] args) {
        Path filePath=Paths.get("c:\\files\\b\\aFile.txt");
        System.out.println(filePath.toString());
        System.out.println(filePath.getFileName());
        for (Path path : filePath) {
            System.out.println(path);
        }
        System.out.println(filePath.getRoot());
        System.out.println(filePath.getName(filePath.getNameCount()-1));
        System.out.println(filePath.getParent().getParent());
    }
}
