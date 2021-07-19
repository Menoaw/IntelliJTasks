package Replit.Rep_03_String;

import java.util.Scanner;

/*
Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars, otherwise print the string unchanged.

Example:

input: xHiX

output: Hi
input: xHiX

output: Hi
input: apple

output: apple
input: apple

output: apple
input: xUxL

output: UxL
input: xUxL

output: UxL
input: JavaX

output: Java
 */
public class WithoutX_x {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();


        if((word.startsWith("x")||word.startsWith("X"))&&(word.endsWith("x")||word.endsWith("X"))){
            System.out.println(word.substring(1,word.length()-1));
        }else{
            System.out.println(word);
        }




    }
}
