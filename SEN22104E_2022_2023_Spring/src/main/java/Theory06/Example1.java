/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory06;

/**
 *
 * @author ali.nizam
 */
public class Example1 {
    public static void main(String[] args) {
        String s = "123";
        int i = Integer.parseInt(s);
        System.out.println(i+1);
        //Long j=Long.valueOf(s);
        long j=Long.parseLong(s);
        for (int k = 0; k < 100000000; k++) {
            j=j+k;
        }
        System.out.println("Finished");
    }
}
