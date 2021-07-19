package day22_Recap;

import java.util.Scanner;

/*
1. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: cybertek
                        password: cybertek12345

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is lucked.
 */
public class Credentials {
    public static void main(String[] args) {

        String usernameCorrect = "cybertek";
        String passwordCorrect = "cybertek12345";

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your username:");
        String usernameInput = scan.next();
        System.out.println("Enter your password:");
        String passwordInput = scan.next();
        if (usernameInput.equals(usernameCorrect) && passwordInput.equals(passwordCorrect)) {
            System.out.println("Logged in");

        } else {
            for (int i = 1; i <= 3; i++) {

                System.err.println("Username or Password incorrect: Failed attempt " + i + " out of 3");
                if (i == 3) {
                    System.err.println("Your account is locked");
                    System.exit(0);
                }
                System.out.println("Enter your username:");
                usernameInput = scan.next();
                System.out.println("Enter your password:");
                passwordInput = scan.next();
                if (usernameInput.equals(usernameCorrect) && passwordInput.equals(passwordCorrect)) {
                    System.out.println("Logged in");
                    break;
                }


            }

        }
        System.out.println("Welcome to the webpage!");
    }
}

