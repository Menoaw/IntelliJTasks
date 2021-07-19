package Rep_03_String;

import java.util.Locale;
import java.util.Scanner;

/*
Write a program that will print out information about user based on email. Print first name, last name, and domain. First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

Example:

Input: craig_federighi@apple.com
Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
 */
public class Email2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        int indexOf_ = email.indexOf("_");
        int indexOfAt = email.indexOf("@");
        int indexOfPeriod = email.indexOf(".");

        String firstName = email.substring(0,indexOf_);
        firstName = (""+firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();
        String lastName = email.substring(indexOf_+1, indexOfAt);
        lastName = (""+lastName.charAt(0)).toUpperCase()+lastName.substring(1).toLowerCase();
        String domain = email.substring(indexOfAt+1, indexOfPeriod);


        System.out.println("First name: "+firstName);
        System.out.println("Last name: "+lastName);
        System.out.println("Domain: "+domain);





    }
}
