package day13_ScannerMethods;

/*
next() returns string. ONLY takes the first word (no space)
 */
import java.util.Scanner;

public class nextMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next(); //only takes first word
        System.out.println("Enter your Last name");
        String lastName = scan.next(); //only takes first word

        String fullName = firstName+" "+lastName;
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("fullName = " + fullName);

        System.out.println("---------------");

        System.out.println("Enter your address");// 7925 Jones Branch Drive

        String address = scan.next();//7925
        String gender = scan.next();//Jones
        String state = scan.next();//Branch
        String city = scan.next();//Drive
        System.out.println("address = " + address);
        System.out.println("gender = " + gender);
        System.out.println("state = " + state);
        System.out.println("city = " + city);




    }
}
