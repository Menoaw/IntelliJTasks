package day16_StringDay2;

import java.util.Scanner;

/*
4. Write a program  for CheckWords:
        Program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */
public class CheckWords_StringPractice4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word:");
        String firstWord = scan.next();
        System.out.println("Enter second word:");
        String secondWord = scan.next();
        System.out.println("Enter third word:");
        String thirdWord = scan.next();
        scan.close();

        boolean allSame = firstWord.length()==secondWord.length()&& firstWord.length()==thirdWord.length();
        boolean notSame = firstWord.length() != secondWord.length() && secondWord.length() != thirdWord.length() && firstWord.length() != thirdWord.length();
        if ( allSame){
            System.out.println("All words are same length");
        }else if(notSame){
            System.out.println("All different length");
        }else{
            System.out.println("Not same nor Different lengths");
        }



    }
}
