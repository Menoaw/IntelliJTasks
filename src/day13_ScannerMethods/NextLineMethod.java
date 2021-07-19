package day13_ScannerMethods;

import java.util.Scanner;
/*
nextLine() ; gives full string, multiple words
 */
public class NextLineMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Job Title: ");
        String jobTitle = scan.nextLine();

        System.out.println("jobTitle = " + jobTitle);


    }
}
