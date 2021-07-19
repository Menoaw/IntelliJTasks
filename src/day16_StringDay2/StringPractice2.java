package day16_StringDay2;

import java.util.Scanner;

/*
2. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */
public class StringPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word:");
        String firstWord = scan.next();
        System.out.println("Enter Second word:");
        String secondWord = scan.next();
        scan.close();

        if (firstWord.length()>=2 && secondWord.length()>=2) {
            System.out.print(firstWord.substring(1));
            System.out.print(secondWord.substring(1));
        }else {
            System.out.println("String too short");
        }



    }
}
