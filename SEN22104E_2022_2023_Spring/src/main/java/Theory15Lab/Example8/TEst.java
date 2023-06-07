/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory15Lab.Example8;

/**
 *
 * @author ali.nizam
 */
public class TEst {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        int result=c.callOperation(new IOperation() {
            @Override
            public int operate(int a, int b) {
               return a+b;
            }
        }, 5, 3);
        System.out.println(result);
        
        int result1=c.callOperation(new IOperation() {
            @Override
            public int operate(int a, int b) {
               return a-b;
            }
        }, 5, 3);
        System.out.println(result1);
        
        int result2=c.callOperation((int a, int b) -> a-b, 5, 3);
        System.out.println(result2);
        
        
        int result3=c.callOperation((int a, int b) -> {return a-b;}, 5, 3);
        System.out.println(result2);
        
       
        
    }
}
