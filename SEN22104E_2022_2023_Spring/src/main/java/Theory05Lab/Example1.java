/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory05Lab;

/**
 *
 * @author ali.nizam
 */
public class Example1 {
    public static void main(String[] args) {
        String word = " Software Engineering ";

       // Length: 22
        System.out.println("Length "+word.length());
       
        word=word.toUpperCase();
        
        System.out.println("Upper "+word );
         
        System.out.println("lower "+word.toLowerCase() );
         
        System.out.println("Omit space " + word.replace(" ",""));
        
        System.out.println("Concat "+word.concat(" Department"));
        
        System.out.println("Omit space " + word.replace("E","A"));
        word = " Software Engineering ";
        System.out.println("Index of n " +word.indexOf('n'));
        
        System.out.println("First char " +word.charAt(1));
        
        System.out.println("Substr" + word.substring(1,5 ));

        /* Upper Case:  COMPUTER ENGINEERING 
        Lower Case:  computer engineering 
        Omit space: ComputerEngineering
        Add 'Department': Computer Engineering Department
        Change 'e' to 'a': Computar Enginaaring Dapartmant
        index of 'n': 10
        first character: C
        shorter string: Soft*/

    }
}
