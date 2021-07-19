package day15_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next();
        System.out.println("Enter your last name");
        String lastName = scan.next();

        char firstInitial = firstName.charAt(0);
        char lastInitial = lastName.charAt(0);

        System.out.println(firstInitial+"."+lastInitial);


    }
}
