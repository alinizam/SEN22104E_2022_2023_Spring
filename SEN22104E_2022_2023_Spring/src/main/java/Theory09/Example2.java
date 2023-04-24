/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory09;

/**
 *
 * @author ali.nizam
 */
public class Example2 {

    public static <T extends Integer> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray) {
            if (e > elem) {//error if whe didn't use uppper bound
                ++count;
            }
        }
        return count;
    }

}
