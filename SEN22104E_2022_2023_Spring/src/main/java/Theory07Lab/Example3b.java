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
public class Example3b {

    //without order
    public static void main(String[] args) {
        String s = "Fatih Sultan";
        boolean[] founded = new boolean[s.length()];
        int count = 0;
        Random r = new Random();
        int order = 0;
        while (order<s.length()) {
            int location = r.nextInt(s.length());
            if (order == location) {
                founded[location] = true;
                System.out.println(s.charAt(location) + ":" + location);
                order++;
            }
            count++;
        }
        System.out.println("Count " + count);
    }

    
}
