/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory13Lab;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example1b {
    public static void main(String[] args) {
        String s="Fatih Sultan Mehmet";
        try(FileWriter fw=new FileWriter("C:\\Files\\character.txt")) {
            for(char c:s.toCharArray()){
                fw.write(c);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Example1b.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Example1b.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
