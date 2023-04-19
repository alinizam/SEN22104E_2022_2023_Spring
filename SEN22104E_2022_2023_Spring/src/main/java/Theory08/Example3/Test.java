/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory08.Example3;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Shape<Integer> s=new Shape();
        s.setT(10);
        System.out.println(s.getT());
        
        Shape<String> s1=new Shape();
        s1.setT("Ahmet");
        System.out.println(s1.getT());
        
        
        Shape<Object> s2=new Shape();
        s2.setT(new Object());
        System.out.println(s2.getT().toString());
    }
}
