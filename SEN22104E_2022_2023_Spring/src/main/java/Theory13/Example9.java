/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example9 {
    public static void main(String[] args) {
        String filePath="c:\\files\\numbers.txt";
        try {
            Scanner s=new Scanner(new BufferedReader(new FileReader(filePath)));
            System.out.println(s.nextInt());
            System.out.println(s.nextBoolean());
            System.out.println(s.nextInt());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Example9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
