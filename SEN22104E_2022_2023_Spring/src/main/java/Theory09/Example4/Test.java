/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory09.Example4;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
       // ArrayList<boolean> i; create an error
       Car<Object> c1=new Car<>();
       Car<Integer> c2=new Car<>();
    //   System.out.println(Car.model);
    }
   /*
    Error: The generic usage is not enough to overload methods
    static <T extends Integer> void setSomething(List<? extends T> i){
     
    }
    static <T extends Number> void  setSomething(List<? extends T> i){
     
    }*/
}
