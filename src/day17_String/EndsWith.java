package day17_String;

import java.util.Scanner;

public class EndsWith {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String email = scan.next();
        scan.close();
        boolean validGmail = email.endsWith("@gmail.com");

        System.out.println(validGmail);



    }
}
