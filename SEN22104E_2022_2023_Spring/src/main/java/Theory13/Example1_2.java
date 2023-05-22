/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author ali.nizam
 */
public class Example1_2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
          FileInputStream file = new FileInputStream("c:\\files\\Hello.txt");
          int i=file.read();
          while (i!=-1){
              System.out.println((char)i);
              i=file.read();
          }
          file.close();
    }
}
