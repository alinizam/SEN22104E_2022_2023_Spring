/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory07;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Example2 {
    public static void main(String[] args) {
        int i=50;
        Integer j=i;
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(i);
        
        
        System.out.println(j);
        calculateSum(j);
        System.out.println(j);
        
        MyNumber n=new MyNumber();
           
        n.i=5;
        System.out.println(n.i);
        calculateSum(n);
        System.out.println(n.i);
    }
    static void calculateSum(Integer i){
        i+=5;
        System.out.println("i in method"+i);
    }
    
     static void calculateSum(MyNumber n){
        n.i+=5;
        System.out.println("i in method"+n.i);
    }
}
