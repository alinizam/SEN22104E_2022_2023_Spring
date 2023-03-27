/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory05;

/**
 *
 * @author ali.nizam
 */
public class Example4 {

    public static void main(String[] args) {
        String name = "Ahmet";
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        // Concat
        String s1 = "Ahmet";
        String s2 = "Ak";
        s1=s1.concat(s2);
        System.out.println(s1);
        
        System.out.println("Ahmet".concat(" ").concat("Ak"));
        //split
        String university="Fatih Sultan Mehmet";
        String[] words=university.split(" ");
        for(String s:words){
            System.out.println(s); 
        }
        //indexOf
        
        System.out.println(university.indexOf("e"));
        System.out.println(university.indexOf("e",4));
        System.out.println(university.indexOf("e",university.indexOf("e")+1));
        
        
        
        
        // replace
               
        System.out.println(university.replace("Mehmet", "Mehmet V.Ü."));
        
        //lastIndexOf
        
        System.out.println(university.lastIndexOf("tih"));
        
    }
}
