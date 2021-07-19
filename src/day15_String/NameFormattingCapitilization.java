package day15_String;
/*
ask the user to enter first name:
1. make sure no white space
2. make sure first character is upper case & rest lower case
 */

import java.util.Scanner;

public class NameFormattingCapitilization {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Name:");
        String firstName = scan.next().trim();
        System.out.println("Enter Last Name:");
        String lastName = scan.next().trim();
        scan.close();

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

        String firstName1 = firstName.substring(0,1).toUpperCase()+ firstName.substring(1).toLowerCase();
        String lastName1 = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println("firstName1 = " + firstName1);
        System.out.println("lastName1 = " + lastName1);





    }
}
