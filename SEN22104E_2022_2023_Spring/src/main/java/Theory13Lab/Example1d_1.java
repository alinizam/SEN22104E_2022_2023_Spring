/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory13Lab;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example1d_1 {
    public static void main(String[] args) {
        try(BufferedReader br=new BufferedReader(new FileReader("c:\\files\\line.txt"))) {
            String s=null;
            while((s=br.readLine())!=null){
                for (char c : s.toCharArray()) {
                    if (Character.isUpperCase(c)){
                        System.out.println(c);
                    }
                }
                        
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Example1d_1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Example1d_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
