/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example7 {

    public static void main(String[] args) {
        Path p = Paths.get("c:\\files");
        try ( DirectoryStream<Path> stream = Files.newDirectoryStream(p)) {
            for (Path path : stream) {
                System.out.println(path.toString());

                if (Files.isDirectory(path)) {
                    DirectoryStream<Path> substream = Files.newDirectoryStream(path);
                    for (Path path1 : substream) {
                        System.out.println(path1);
                    }
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(Example7.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
