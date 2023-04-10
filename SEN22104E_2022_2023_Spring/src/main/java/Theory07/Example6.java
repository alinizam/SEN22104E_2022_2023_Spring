/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory07;

import java.text.DecimalFormat;

/**
 *
 * @author ali.nizam
 */
public class Example6 {
    public static void main(String[] args) {
        Double d=1243.6;
        String pattern="000,000.000";
        DecimalFormat f=new DecimalFormat(pattern);
        String result=f.format(d);
        System.out.println(result);
    }
}
