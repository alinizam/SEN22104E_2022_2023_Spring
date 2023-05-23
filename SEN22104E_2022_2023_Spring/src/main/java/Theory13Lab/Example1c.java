/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory13Lab;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example1c {

    public static void main(String[] args) {
        String s = "Fatih Sultan Mehmet";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\files\\line.txt"))) {
            for (String word : s.split(" ")) {
                bw.write(word);
                bw.newLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(Example1c.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
