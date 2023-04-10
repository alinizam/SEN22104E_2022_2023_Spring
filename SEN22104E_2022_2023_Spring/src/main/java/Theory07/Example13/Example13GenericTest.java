/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory07.Example13;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Example13GenericTest {
    public static void main(String[] args) {
        System.out.println(CalculatorWithoutGeneric.add(10, 5)); 

        Calculator<Integer> calc=new Calculator<Integer>();
        System.out.println(calc.add(10, 50));
        Calculator<Double> calc1=new Calculator<Double>();
        System.out.println(calc1.add(10.0, 50.1));
        
        ArrayList<Integer> numbers=new ArrayList();
        numbers.add(10);
        numbers.add(50);
        
        for (Integer number : numbers) {
            System.out.println(number+1);
        }
    }
}
