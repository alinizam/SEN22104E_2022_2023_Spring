/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author ali.nizam
 */
public class Example9 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        JFileChooser fc=new JFileChooser();
        int choise=fc.showOpenDialog(fc);
        if (choise==JFileChooser.APPROVE_OPTION){
            File f=fc.getSelectedFile();
            BufferedReader r=new BufferedReader(new FileReader(f));
            System.out.println(r.readLine());
            r.close();
        }
    }
}
