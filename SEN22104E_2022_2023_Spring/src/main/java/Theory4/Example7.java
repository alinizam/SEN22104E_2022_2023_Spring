/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory4;

/**
 *
 * @author ali.nizam
 */
public class Example7 {
    public static void main(String[] args) {
        try{
           int i=1/1;  
           return; 
        }catch(ArithmeticException|NumberFormatException e){
            System.out.println("Error occcurred "+e.getClass());
        }finally{
            System.out.println("Executed");
        }
        
    }
}
