/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory07;

/**
 * @author ali.nizam
 */
public class Example10 {
    public static void main(String[] args) {
        int[] rNumbers=new int[3];
        for (int i = 0; i < 100000; i++) {
            rNumbers[(int)(3*(Math.random()))]++;
        }
        for (int rNumber : rNumbers) {
            System.out.println(rNumber);    
        }
    }
    
}
