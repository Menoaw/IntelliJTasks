package day20_Loops;

import java.util.Scanner;

/*
4. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop
 */
public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int result = 0;
        for (int i = 0; i == 0;) {   //inf loop for( ; ; ){}
            System.out.println("Enter a number:");
            int n = scan.nextInt();
            if(n<0){
                break;
            }else{
                result += n;
            }System.out.println(result);



        }System.out.println(result);

scan.close();


    }


}
