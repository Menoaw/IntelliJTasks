package day13_ScannerMethods;

import java.util.Scanner;

public class PersonalInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your salary:");
        int salary = scan.nextInt();//50000
        System.out.println("Enter your Gender:");
        String gender = scan.next();//male (Enter in memory)
        scan.nextLine(); //CLEARS Enter
        System.out.println("Enter your full name:");
        String fullName = scan. nextLine();//Matthew Knittig Enter
        System.out.println("Enter your job title:");
        String jobTitle = scan.nextLine();//Pro Gamer Enter

        System.out.println("salary = " + salary);
        System.out.println("gender = " + gender);
        System.out.println("fullName = " + fullName);


    }
}
