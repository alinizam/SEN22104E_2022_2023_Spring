/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory15Lab.Example8;

/**
 *
 * @author ali.nizam
 */
public class Calculator {
    int callOperation(IOperation operation, int a,int b){
        return operation.operate(a, b);
    }
}
