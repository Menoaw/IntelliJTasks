package day13_ScannerMethods;

import java.util.Scanner;

public class disadvantageNextLineMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Age:");
        int age = scan.nextInt(); //1 9 enter
        scan.nextLine();
        System.out.println("Enter your job title:");
        String jobTitle = scan.nextLine(); // takes everything including Enter
        System.out.println("age = " + age); //19
        System.out.println("jobTitle = " + jobTitle);//enter
        System.out.println("----------------");


    }
}
