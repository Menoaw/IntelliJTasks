package day13_ScannerMethods;

import java.util.Scanner;

/*
1. Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents

                Enter cents
                300 cents equal to: 3 dollars
 */
public class centsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number here: ");
        int cents = scan.nextInt();
        int dollars = cents / 100;
        int remainingCents = cents % 100;
        if (cents >= 0){
            if (remainingCents == 0) {
                System.out.println("dollars = " + dollars);
            } else {
                System.out.println("Dollars = " + dollars);
                System.out.println("Cents = " + remainingCents);
            }
    }else {
            System.out.println("Amount invalid.");
        }





    }
}
