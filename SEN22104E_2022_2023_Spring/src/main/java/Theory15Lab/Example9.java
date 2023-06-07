/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory15Lab;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Example9 {
    public static void main(String[] args) {
        ArrayList<String> s=new ArrayList<>();
        s.add("Ahmet");
        s.add("Mehmet");
        for (String string : s) {
            System.out.println(s);
        }
        s.stream().forEach(e->System.out.println(e));
        
        s.stream().forEach(System.out::println);
    }
}
