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
public class Example3a {
    //without order
    public static void main(String[] args) {
        String s = "Fatih Sultan";
        boolean[] founded = new boolean[s.length()];
        int count=0;
        Random r=new Random();
        while (isFounded(founded)) {
            int location=r.nextInt(s.length());
            founded[location]=true;
            System.out.println(s.charAt(location) +":"+location);
            count++;
        }
        System.out.println("Count " + count);
    }

    private static boolean isFounded(boolean[] founded) {
        boolean found = false;
        for (boolean b : founded) {
            if (!b) {
                found = true;
                break;
            }
        }
        return found;
    }
}
