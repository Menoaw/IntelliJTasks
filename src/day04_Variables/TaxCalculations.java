package day04_Variables;
/*



 */

public class TaxCalculations {
    public static void main(String[] args) {

        int salary = 100000;
        double stateTax = 0.08;
        double federalTax = .21;
        double totalStateTax = salary*stateTax;
        double totalFederalTax = salary*federalTax;
        double salaryAfterTax = salary - (totalStateTax + totalFederalTax);

        System.out.println("Your salary is $"+salary);
        //you need to pay amount to state tax
        System.out.println("You need to pay $"+totalStateTax+ " to state tax.");
        //you need to pay amount to federal tax
        System.out.println("You need to pay $"+totalFederalTax+ " to federal tax.");

        System.out.println("Your take home salary is $" + salaryAfterTax + " after taxes");



    }

}
