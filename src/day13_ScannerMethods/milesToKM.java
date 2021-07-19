package day13_ScannerMethods;

import java.util.Scanner;

/*
2. Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers
 */
public class milesToKM {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of Miles here: ");
        double miles = scan.nextDouble();
        double km = miles*1.609;
        System.out.println("KM = " + km);



    }
}
