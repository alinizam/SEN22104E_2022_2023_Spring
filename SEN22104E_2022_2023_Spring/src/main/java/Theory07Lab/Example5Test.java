/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory07Lab;

/**
 *
 * @author ali.nizam
 */
public class Example5Test {
    public static void main(String[] args) {
        String names[]={"Fatih","Sultan","Mehmet"};
        
        Swifter<String> shitfer=new Swifter();
        
        shitfer.swap(names, 0, 1);
        for (String name : names) {
            System.out.println(name);
        }
        
        Swifter<Integer> shitferInt=new Swifter();
        
         Integer numbers[]={10,20,30};
         shitferInt.swap(numbers, 1, 2);
         for (Integer number : numbers) {
             System.out.println(number);
        }
        
    }
}
