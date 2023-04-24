/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory09;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ali.nizam
 */
public class Example1 {
    public static void main(String[] args) {
      //  ArrayList<Integer> i=new ArrayList<Number>();
      //  i.add(10.0);
      getType(new ArrayList<Object>());
    }
    static void getType(List<? super Number> number){
        System.out.println(number.size());
    }
}
