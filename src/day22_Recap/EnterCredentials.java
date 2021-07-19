package day22_Recap;

import java.util.Scanner;

public class EnterCredentials {
    public static void main(String[] args) {


        String username = "cybertek";
        String password = "cybertek12345";
        Scanner scan = new Scanner(System.in);
        String u = "";
        String p = "";

        do {

            System.out.println("Enter username: ");
            u = scan.next();
            System.out.println("Enter password: ");
            p = scan.next();
        }
        while (!(u.equals(username)&&p.equals(password)));
        System.out.println("Good");

    }
}
