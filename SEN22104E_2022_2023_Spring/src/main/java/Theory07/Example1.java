package Theory07;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ali.nizam
 */
public class Example1 {
    public static void main(String[] args) {
        String s="a2a11123 Sultaass1 a1 a1n Me.h.Me 112\n";
     // controlPattern("([A-z][0-9]){2}",s);
      //  controlPattern("\\bMe\\b", s);
      //  controlPattern("\\G(a1)", s);
          controlPattern("[0-9]\\z", s);
        
        
    }
    static int controlPattern(String pattern, String searchText) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(searchText);
        int count = 0;
        while (m.find()) {
            System.out.println(m.group() + "  -  " + m.start() + ":" + m.end());
            count++;
        }
        return count;
    }

}
