/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week08Theory.Example5;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        //ArrayList<?> numbers=new ArrayList<>();
        ArrayList<?> numbers=new ArrayList<>();
        
        getTotalNumber(new ArrayList<Number>());
       // getTotalNumber(new ArrayList<Integer>()); error
        
       
        getTotalNumberWithWildCard(new ArrayList<Number>());
        getTotalNumberWithWildCard(new ArrayList<Integer>());
       // getTotalNumberWithWildCard(new ArrayList<String>()); error
    }
    static <T extends ArrayList<Number>> int getTotalNumber(T list){
        return list.size();
    }
    
    static <T extends ArrayList<? extends Number>> int getTotalNumberWithWildCard(T list){
        return list.size();
    }
}
