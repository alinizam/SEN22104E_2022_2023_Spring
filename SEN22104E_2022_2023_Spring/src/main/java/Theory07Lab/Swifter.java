/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory07Lab;

/**
 *
 * @author ali.nizam
 */
public class Swifter<T>{
    void swap(T[] array,int source,int target){
        T temp=array[source];
        array[source]=array[target];
        array[target]=temp;
    }
}
