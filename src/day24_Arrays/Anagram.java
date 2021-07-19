package day24_Arrays;

import java.util.Arrays;
import java.util.Locale;

/*
    heart && earth
    race && care
    listen && silent
    output: true
     */
public class Anagram {
    public static void main(String[] args) {

        String str1 = "hEaRt";
        String str2 = "earth";
        char[] c1 = str1.toLowerCase().toCharArray();
        char[] c2 = str2.toLowerCase().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        boolean isAnagram = Arrays.equals(c1,c2);
        System.out.println("isAnagram = " + isAnagram);
        if( Arrays.equals(c1,c2) ){
            System.out.println("These two words are anagrams.");
        }else{
            System.out.println("Not an anagram");
        }





    }
}
