/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory05;

/**
 *
 * @author ali.nizam
 */
public class Example1 {
    public static void main(String[] args) {
        int i=5,j=0;
        int[] numbers=null;
        try {
            i=5/j;
            System.out.println(numbers[0]);
            
        } catch (Exception e) {
            if (e instanceof ArithmeticException){
                //solution
            }else if (e instanceof NullPointerException){
                //solution
            }
        } finally {
           
        }
    }
 
}
