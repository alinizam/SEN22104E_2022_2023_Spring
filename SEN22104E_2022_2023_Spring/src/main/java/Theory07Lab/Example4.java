/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory07Lab;

import java.util.Random;

/**
 *
 * @author ali.nizam
 */
public class Example4 {

    public static void main(String[] args) {
        String s = "Fa123t1213S1132";

        Random r = new Random();
        
        for (int i = 0; i < 10; i++) {
            int sum = 0, count = 0;
            for (int j = 0; j < 3; j++) {
                char selected = s.charAt(r.nextInt(s.length()));
                if (Character.isDigit(selected)) {
                    System.out.println(selected);
                    sum =sum + Integer.parseInt(String.valueOf(selected));
                    count++;
                }
            }
            if (count == 3) {
                System.out.println("Total value of selected digits = " + sum);
            } else {
                System.out.println("Not all characters are digits");
            }
        }

    }
}
