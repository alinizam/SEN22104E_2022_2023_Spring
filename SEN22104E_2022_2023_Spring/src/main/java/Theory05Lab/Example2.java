/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory05Lab;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Example2 {

    public static void main(String[] args) {
        String name = "Ahmet Ak";
        int indexOfSpace = name.indexOf(" ");
        System.out.println("First Name: " + name.substring(0, indexOfSpace));
        System.out.println("Last Name: " + name.substring(indexOfSpace + 1));
        String sentence = "fatih sultan mehmet vakif üniversity";
        // String[] words = {"fatih", "sultan", "mehmet", "vakif", "univarsitiy"};
        ArrayList<String> words = new ArrayList<>();
        while (sentence != "") {
            int indexOf = sentence.indexOf(" ");
            if (indexOf == -1) {
                words.add(sentence);
                sentence = "";
                break;
            }
            String word = sentence.substring(0, indexOf);
            words.add(word);
            sentence = sentence.substring(indexOf + 1);

        }

        for (String word : words) {
            sentence += word + " ";
        }

        System.out.println(sentence);
        
        char[] chars=StringToCharArray(sentence);
        for (char aChar : chars) {
            System.out.println(aChar);
        }
        System.out.println(new String(chars));
        
    }

    public static char[] StringToCharArray(String sentence) {
        char[] chars = new char[sentence.length()];

        for (int i = 0; i < sentence.length(); i++) {
            chars[i] = sentence.charAt(i);
        }
        return chars;

    }
}
