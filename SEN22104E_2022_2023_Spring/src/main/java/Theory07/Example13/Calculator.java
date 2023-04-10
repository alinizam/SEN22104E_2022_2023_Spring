/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory07.Example13;

/**
 *
 * @author ali.nizam
 */
public class Calculator<T extends Number> {

    //Not a perfect solution. A better solution will be explained. (A Nizam)
    T add(T n1, T n2) {
        //T value=(T) n1.getClass().cast(n1.doubleValue()+n2.doubleValue());
        T value = null;
        if (n1 instanceof Double) {
            value = (T) n1.getClass().cast(n1.doubleValue() + n2.doubleValue());
        } else if (n1 instanceof Integer) {
            value = (T) n1.getClass().cast(n1.intValue() + n2.intValue());
        }
        return value;
    }

}
