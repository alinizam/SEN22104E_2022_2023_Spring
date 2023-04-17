/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week08Theory.Example2;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class TestRawTypeInvocation {
    public static void main(String[] args) {
        ArrayList  numbers;
        numbers=new ArrayList<Integer>();
        
        numbers.add(10);
        numbers.add("Ahmet");
        for (Object number : numbers) {
            int i=(Integer)number;
        }
        
    }
}
