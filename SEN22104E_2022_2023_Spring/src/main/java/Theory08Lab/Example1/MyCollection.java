/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory08Lab.Example1;

import java.lang.reflect.Array;
import java.lang.Class;

/**
 *
 * @author ali.nizam
 */
public class MyCollection<T> {
    //it should be solved with array list. 
    private Object[] myArray;
    int arraySize;

    public T getMyArrayElement(int i) {
        return (T)myArray[i];
    }
     

    public MyCollection(int arraySize) {
        this.arraySize=arraySize;
        myArray=new Object[arraySize];   
       // myArray=(T[])Array.newInstance(t.getClass(), arraySize);
    }
    
    void add(T t) {
        for (int i = 0; i < arraySize; i++) {
            if (myArray[i] == null) {
                myArray[i] = t;
                break;
            }
        } 
    }
    
    

}
