package day21_Loops;

import java.util.Scanner;

/*
4. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop
 */
public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
int sum = 0;
int n = 0;
        while (n >=0) {
            System.out.println("Enter a number: ");
            n = scan.nextInt();

            sum += n;
        }
        System.out.println(sum);




    }
}
