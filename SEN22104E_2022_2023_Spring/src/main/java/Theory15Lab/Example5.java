/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory15Lab;

/**
 *
 * @author ali.nizam
 */
public class Example5 {

    public static void main(String[] args) {
       // System.out.println(findTotal(5));
        findTotalWithGlobal(100);
    }

    static int findTotal(int n) {
        if (n == 0) {
            return n;
        }
        return n + findTotal(n - 1);
    }
    static int total=0;
    static int findTotalWithGlobal(int n) {
        if (n == 0) {
            System.out.print("(0)");
            return 0;
        }
        System.out.print("("+(n)+"+f");
        total=n + findTotalWithGlobal(n - 1);
        System.out.print(")");
        return total;
        
    }

}
