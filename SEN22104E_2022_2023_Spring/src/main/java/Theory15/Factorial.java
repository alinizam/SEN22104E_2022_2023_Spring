/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory15;

/**
 *
 * @author ali.nizam
 */
public class Factorial {
    public static void main(String[] args) {
        factorial(5000);
    }
    static int factorial(int n){
        if (n==0){
            return 1;
        }
        //System.out.println(n+"*factorial("+(n-1)+")");
        return n*factorial(n-1);
    }
}
