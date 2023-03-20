/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory4;

import java.util.Scanner;

/**
 *
 * @author ali.nizam
 */
public class Example9 {
    public static void main(String[] args) {
        int amount =5;
        Scanner s=new Scanner(System.in);
        int decr=s.nextInt();
        if (amount-decr<0)
            throw new StockException();
    }
}
