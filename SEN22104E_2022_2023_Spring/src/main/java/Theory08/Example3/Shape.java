/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory08.Example3;

/**
 *
 * @author ali.nizam
 */
public class Shape<T> implements IShape<T>{
    T t;
    @Override
    public T getT() {
        System.out.println(t);
        return t;
    }

    @Override
    public void setT(T t) {
        this.t=t;
    }
    
    
}
