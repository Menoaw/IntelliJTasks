package day03_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        /*

        Hourly rate
                Weekly Hours
                        How many Weeks per year
        */
        int hourlyRate = 60;
        int weeklyHours = 50;
        int numberOfWeeksInAYear = 48;
        int salary = hourlyRate * weeklyHours * numberOfWeeksInAYear;
        System.out.print("The Yearly Salary of the employee is : ");
        System.out.println(salary);

        double taxRate = 0.32;
        double salaryAfterTax = salary * (1-.32);
        System.out.println("The Yearly Salary of the employee after tax is: " + salaryAfterTax);

        //continue later.



    }


}
