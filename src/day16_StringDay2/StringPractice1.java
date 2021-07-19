package day16_StringDay2;

import java.util.Scanner;

/*
1. write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */
public class StringPractice1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scan.nextLine();

        scan.close();

        if (input.length()==0){
            System.out.println("string is empty");
        }else if(input.length()>3){
            System.out.println(input.substring(input.length()-3));
        }else{
            System.out.println(input);
        }





    }
}
