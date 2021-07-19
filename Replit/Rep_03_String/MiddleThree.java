package Replit.Rep_03_String;

import java.util.Scanner;

public class MiddleThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        if(word.length()>=5&&(word.length()%2)!=0) {
            System.out.println(word.substring(word.length()/2-1,word.length()/2+2));
        }else{
            System.out.println("invalid");
        }


    }
}
