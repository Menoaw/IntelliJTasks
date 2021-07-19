package day15_String;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        /*
        only reverse 5 char, else too short or too long
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.next();
        String result = "";

        if(word.length()>5){
            System.out.println("Too Long!");
        }else if(word.length()<5){
            System.out.println("Too Short!");
        }else{
            /*
            result += word.charAt(4);
            result += word.charAt(3);
            result += word.charAt(2);
            result += word.charAt(1);
            result += word.charAt(0);
             */
            result += ""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);
        }
        System.out.println(result);

    }
}
