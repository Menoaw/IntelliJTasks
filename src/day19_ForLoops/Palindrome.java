package day19_ForLoops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        //racecar = racecar ---- reverse same as original.

        String word = new Scanner(System.in).next();
        String reverseWord = "";
        for (int i = word.length()-1; i >=0 ; i--) {
            reverseWord += word.charAt(i);
        }
        boolean isPalindrome = word.equalsIgnoreCase(reverseWord);
        System.out.println("isPalindrome = " + isPalindrome);



    }
}
