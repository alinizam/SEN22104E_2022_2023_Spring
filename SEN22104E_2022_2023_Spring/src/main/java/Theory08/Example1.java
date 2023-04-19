/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory08;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Example1 {
    public static void main(String[] args) {
        ArrayList numbers=new ArrayList();
        numbers.add(50);
        numbers.add(10);
        numbers.add(5);
        numbers.add(5.5);
        numbers.add("10");
        int total=0;
        for (Object number : numbers) {
            if (number instanceof Integer)
                total+=(Integer)number;
        }
        System.out.println("Total = "+total);
    }
}
