/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory06;

/**
 *
 * @author ali.nizam
 */
public class Example7 {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("Ahmet home");
        System.out.println(s);
        s.insert(5, " is going to");
        System.out.println(s);
        s.replace(0, 5, "Mehmet");
        System.out.println(s);
    }
}
