/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory08.Example4;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Box<Number> bNumber=new Box<Number>();
        Box<Double> bDouble=new Box<Double>();
        Number n=new Double(10);
        //b=b1; error
        //Box<Number>() = Box<Double>()
        Number n1=1;
        checkType(n1);
        checkType(new Integer(10));
        
        checkBoxType(bNumber);
       // checkBoxType(bDouble); error
        
    }
    static <T extends Number> int checkType(T t){
        return 0;
    }
    
    static <T extends Box<Number>> int checkBoxType(T t){
        return 0;
    }
}
