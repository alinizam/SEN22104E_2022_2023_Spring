/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory13Lab;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Example2 {
    public static void main(String[] args) {
        String file="c:\\files\\numbers.txt";
        int numbers[]=new int[10];
        try(Scanner s=new Scanner(new BufferedInputStream(new FileInputStream(file)))) {
            int i=0;
            int sum=0;
            while(s.hasNextInt()){
                numbers[i]=s.nextInt();
                System.out.println("numbers["+i+"]="+numbers[i]);
                sum+=numbers[i];
                i++;
            }
            System.out.println("Sum = " + sum);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Example2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
