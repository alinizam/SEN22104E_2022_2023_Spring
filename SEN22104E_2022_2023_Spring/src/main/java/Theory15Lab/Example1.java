/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory15Lab;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.FileSystems;

/**
 *
 * @author ali.nizam
 */
public class Example1 {
    public static void main(String[] args) throws IOException {
        Path dir=Paths.get("c:\\files");
        DirectoryStream<Path> ds=Files.newDirectoryStream(dir);
        for (Path d : ds) {
            PathMatcher m=FileSystems.getDefault().getPathMatcher("glob:*.{txt}");
            if (m.matches(d.getFileName())){
                System.out.println(d.getFileName());
            }
            
        }
    
    }
}
