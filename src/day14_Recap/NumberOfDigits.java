package day14_Recap;

import java.util.Scanner;

/*
Given a number(int) determine and print how many digits it has.
            - Condition: The number has to be between 1 and 100000, if it is not print "Invalid number"

            Ex: 124 --> 3 digits
                13213 --> 5 digits
                883218 --> Invalid number
                23 --> 2 digits
                9 --> one digit
                15 --> 2 digits
 */
public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String result = "";

        System.out.println("Enter a number between 1 and 100000: ");
        int digit = scan.nextInt();
        scan.close();
        if(digit>=1&&digit<=100000) {
            if (digit >= 1 && digit <= 9) {
                result = "This Number has 1 Digit";
            }else if(digit<=99){
                result = "This Number has 2 Digits";
            }else if(digit<=999){
                result = "This Number has 3 Digits";
            }else if(digit>=1000&&digit<=9999){
                result = "This Number has 4 Digits";
            }else if(digit>=10000&&digit<=99999){
                result = "This Number has 5 Digits";
            }else{
                result = "This Number has 6 Digits";
            }
            System.out.println(result);
        }else{
            System.out.println(digit+" is an Invalid Number");
        }


    }
}
