/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author ali.nizam
 */
public class Example1_1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream file = new FileInputStream("c:\\files\\Hello.txt");
        int i = file.read();
        System.out.println((char) i + "   " + i);
        i = file.read();
        System.out.println((char) i + "   " + i);
        i = file.read();
        System.out.println((char) i + "   " + i);
        i = file.read();
        System.out.println((char) i + "   " + i);
        i = file.read();
        System.out.println((char) i + "   " + i);
        i = file.read();
        System.out.println((char) i + "   " + i);
        i = file.read();
        System.out.println((char) i + "   " + i);
        i = file.read();
        System.out.println((char) i + "   " + i);
        i = file.read();
        System.out.println((char) i + "   " + i);
        i = file.read();
        System.out.println((char) i + "   " + i);
        i = file.read();
        System.out.println((char) i + "   " + i);
        i = file.read();
        System.out.println((char) i + "   " + i);
        file.close();
    }
}
