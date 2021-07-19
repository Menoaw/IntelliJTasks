package day12_Scanner;

import java.util.Scanner;

/*
1. Hourly Rate of Pay
2. How many Hours per week
3. How many weeks do you work in a year

 */
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Hourly Rate: ");
        double hourly = scan.nextDouble();
        System.out.println("Enter your Hours per Week: ");
        double hours = scan.nextDouble();
        System.out.println("Enter how many Weeks per Year Worked: ");
        double weeks = scan.nextDouble();

        System.out.println("You are Making $"+hourly+" per hour");
        double yearlySalary = (hourly*hours)*weeks;
        System.out.println("yearlySalary = " + yearlySalary);
        double salaryAfterTax = yearlySalary*.7;
        System.out.println("salaryAfterTax = " + salaryAfterTax);

    }
}
