package day18_Recap;

import java.util.Locale;
import java.util.Scanner;

/*
1. Ask user to enter a word. If the work contains starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */
public class WithOutX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.next();
        if(word.toLowerCase().charAt(0)=='x'){
            System.out.println(word.substring(1));
        }else{
            System.out.println(word);
        }


    }
}
