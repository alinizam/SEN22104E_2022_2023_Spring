/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory04Lab;

/**
 *
 * @author ali.nizam
 */
public class Example1 {

    public static void main(String[] args) {
        String numbers[] = {"10", "10%", "5", "20d", "3"};

        for (String n : numbers) {
            try {
                System.out.println(Integer.parseInt(n));
            } catch (Exception e) {
                System.out.println("Incorrect number format = "+n);
            }
        }

    }
}
