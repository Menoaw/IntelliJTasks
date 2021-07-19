package Replit.Rep_03_String;

import java.util.Scanner;

public class VerifyContains {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        String word = scan.next();
        System.out.println(sentence.contains(word));



    }
}
