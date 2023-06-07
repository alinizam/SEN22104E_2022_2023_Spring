/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory15Lab;

/**
 *
 * @author ali.nizam
 */
public class Example6 {
    public static void main(String[] args) {
         System.out.println(findBinaryRepresentation(12));
          
    }
    static int findBinaryRepresentation(int d){
        if (d==0){
            return 0;
        }
        return d%2+10*findBinaryRepresentation(d/2);
    }
}
