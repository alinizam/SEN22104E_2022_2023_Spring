/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory08Lab.Example1;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        MyCollection<Integer> intArray=new MyCollection<Integer>(5);
        intArray.add(10);
        intArray.add(new Integer(15));
        intArray.add(new Integer(15));
        
        for (int i = 0; i < intArray.arraySize; i++) {
            System.out.println(intArray.getMyArrayElement(i));
        }
        
         
        
    }
}
