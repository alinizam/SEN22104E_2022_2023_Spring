/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ali.nizam
 */
public class Example8 {
    public static void main(String[] args) {
        String regexString="[a-zA-Z]";
        String searchString="Ahm12?1?et4512### fgl@213s1kl 55Ah4met dsfsgs.";
      //Search digit
        regexString="[0-9]";
       //Searc not alphabetic characters
        regexString="[^a-zA-Z0-9]";
       //Union
        regexString="[[a-b][d-h]]"; //a,b,d,g,i,h
       //Intersection
        regexString="[[0-4]&&[3-5]]";
       
        //Minus
        regexString="[[0-4]&&[^3-5]]";
        
        //Except word character
        regexString="[\\W]";
        
        //Except word character
        regexString="[\\w]";
        
        //Numeric 
        regexString="[\\d]";
        //Not Numeric 
        regexString="[\\D]";
        
        //Repetations
        regexString="[0-9]{3}";
        
         //Repetations
        regexString="[[A-z]0-9]{3}";
        
          //Repetations min
        regexString="[[A-z]0-9]{3,}";
        
        //Group Search
        regexString="([A-z][0-9][0-9])";
        
        findPattern(regexString, searchString);
        
        
        
        
    }
    static void findPattern(String regexString, CharSequence searchString){
        Pattern p=Pattern.compile(regexString);
        Matcher m=p.matcher(searchString);
        while (m.find()){
            System.out.println(m.start()+" "+m.end()+" "+m.group());  
        }
    }
}
