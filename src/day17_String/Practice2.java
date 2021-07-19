package day17_String;

import java.util.Scanner;

/*
2. write a program that can return the initials of the user
            ex:
                cybertek
                school
            output:
                C.S
 */
public class Practice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter first name");
        String firstName = scan.next();
        System.out.println("enter last name");
        String lastName = scan.next();

        scan.close();
        //String initials = firstName.substring(0,1).toUpperCase()+"."+lastName.substring(0,1).toUpperCase();
        String initials = firstName.charAt(0)+"."+lastName.charAt(0);
        initials = initials.toUpperCase();
        System.out.println(initials);




    }
}
