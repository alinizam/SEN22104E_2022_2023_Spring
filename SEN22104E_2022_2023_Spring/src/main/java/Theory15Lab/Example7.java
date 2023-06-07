/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory15Lab;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

/**
 *
 * @author ali.nizam
 */
public class Example7 {
    public static void main(String[] args) throws IOException{
        visitFiles(Paths.get("c:\\files"));
    }
    static void visitFiles(Path path) throws IOException{
        DirectoryStream<Path> ds=Files.newDirectoryStream(path);
        for (Path d : ds) {   
            System.out.println(d);
            if (Files.isDirectory(d)){ 
                visitFiles(d); 
            }
        } 
    }
}
