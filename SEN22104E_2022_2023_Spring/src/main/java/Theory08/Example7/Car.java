/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory08.Example7;

/**
 *
 * @author ali.nizam
 * @param <T>
 */
public class Car<T extends Shape&IMoveable> {
    T o;

    public T getO() {
        Shape s=o;
        s.getSize();
        return o;
    }
    
    void moveCar(){
       
    }
}
