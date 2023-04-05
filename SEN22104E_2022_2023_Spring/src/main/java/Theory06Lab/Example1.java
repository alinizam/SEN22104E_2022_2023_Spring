/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory06Lab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ali.nizam
 */
public class Example1 {

    public static void main(String[] args) {
        String pattern = "\\b[\\w]*[0-9.]+[\\w]*";
        String searchText = "Fatih 123.3 Su1ltan Mehmet3.2 foundation .3 University3";
        //1a
        //int count=controlPattern(pattern, searchText);
        //System.out.println("The number ofwords with digit" + count);
        //1b
       // pattern="\\b[\\S]&&[^.]";
        pattern="\\b"; //[[\\w]&&[^.]]";
       // controlPattern(pattern, searchText);

        //question1b();
        pattern = "[0-9]";
        // System.out.println(findDigitTotat(pattern, searchText));
        //
        pattern = "[0-9]+[.][0-9]+";
        //System.out.println(controlPattern(pattern, searchText));

        convertDoubleFormat(pattern, searchText);
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

    static void question1b() {
        String searchText = "Fatih 123.3 Su1ltan Mehmet3.2 foundation University3";
        String words[] = searchText.split(" ");
        for (String word : words) {
            System.out.println(word.charAt(0));
        }
    }

    static int findDigitTotat(String pattern, String searchText) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(searchText);
        int sum = 0;
        while (m.find()) {
            System.out.println(m.group() + "  -  " + m.start() + ":" + m.end());
            sum += Integer.parseInt(m.group());
        }
        return sum;
    }

    static void convertDoubleFormat(String pattern, String searchText) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(searchText);
        int sum = 0;
        StringBuilder s = new StringBuilder(searchText);
        int shift=0;
        while (m.find()) {
            System.out.println(m.group() + "  -  " + m.start() + ":" + m.end());
            double d = Double.parseDouble(m.group());
           
            String formatted=String.format("%.3f", d);
            System.out.println(formatted);
            
            s.replace(m.start()+shift, m.end()+shift, formatted);
            shift+=(formatted.length()-m.group().length());
        }
         
        System.out.println(s);
    }

}
