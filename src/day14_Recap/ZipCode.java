package day14_Recap;

import java.util.Scanner;

/*
 - - Ask the user to enter their zipcode (long), the number of people they live with (byte),
                if they are married or not (boolean - true for married/false for not) and print the values in the following format:

            Ex:
                inputs: 31009, 4, false

                output:
                     I see you are not married and live with 4 people in your house which is in the 31009 area!
 */
public class ZipCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Zipcode: ");
        long zipcode = scan.nextLong();
        System.out.println("Enter the number of people you live with: ");
        byte people = scan.nextByte();
        System.out.println("Are you Married? ");
        boolean IsMarried = scan.nextBoolean();
        scan.close();

        System.out.println("I see you are "+ ((IsMarried)?"married":"not married") +
                " and live with "+people+" people in your house which is in the "+zipcode+" area!");
    }
}
