/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory08.Example6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author ali.nizam
 */
public class Test {
    static List<?> concatList(List<?> list1,List<?> list2){
        return list1;//Not implementer
    }
    
    static <T> List<? extends T> concatListWithTypeParamater(List<? extends T> list1,List <? extends T> list2){
        return  list1;
     /*   return Stream.concat(list1.stream(), list2.stream())
        .collect(Collectors.toList());*/
    }
    
    /*public static <E> List<E> mergeTypeParameter(List<? extends E> listOne, List<? extends E> listTwo) {
    return Stream.concat(listOne.stream(), listTwo.stream())
            .collect(Collectors.toList());
    }*/

    
    public static void main(String[] args) {
        List<Number> list1=new ArrayList<>();
        List<Number> list2=new ArrayList<>();
        //List<Number> list3=concatList(list1,list2); //error
        
        List<? extends Number> list3=concatListWithTypeParamater(list1,list2);
        
    }
    
    
}
