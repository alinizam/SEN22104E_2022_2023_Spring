/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory08.Example2;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Shape<Integer> s1=new Shape<Integer>();
        Shape<Integer> s3=new Shape(); //it can create a warning
        Shape s4=new Shape();  // it create a warning, and problematic syntax
        
    }        Shape<Integer> s2=new Shape<>();//most preferred usage

}
