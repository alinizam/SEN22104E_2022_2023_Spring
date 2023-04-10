/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory07;

import java.util.Locale;

/**
 *
 * @author ali.nizam
 */
public class Example5 {

    public static void main(String[] args) {
      /*  int year = 2023;
        int documentNumber = 1;
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d%07d\n", year, documentNumber);
            documentNumber++;
        }
        
        System.out.printf("%d%+07d\n", year, -150);*/
      //  System.out.printf(Locale.FRENCH,"%010.2f\n",  1.0);
        
        System.out.printf(Locale.GERMANY,"%,010.2f %d\n",  14564564.5656);
    }
}
