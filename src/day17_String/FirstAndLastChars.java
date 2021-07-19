package day17_String;

import java.util.Scanner;

/*
3. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
 */
public class FirstAndLastChars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.next();
        scan.close();


        String firstLetter = word.substring(0,1);
        String lastLetter = word.substring(word.length()-1);

        if(firstLetter.equalsIgnoreCase(lastLetter)){
            System.out.println("same");
        }else{
            System.out.println("Different");
        }







    }
}
