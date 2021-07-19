package Replit.Rep_02_Statements;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner scan = new Scanner(System.in);
        double tip = 0;
        double totalToPay = 0;
        double totalPerPerson = 0;
        double tipPerPerson = 0;
        System.out.println("Split:");
        String isSplit = scan.next();

        int numberOfPeople = 0;
        if (isSplit.equalsIgnoreCase("yes")) {
            System.out.println("Number of people:");
            numberOfPeople = scan.nextInt();
        } else if (isSplit.equalsIgnoreCase("no")) {
            numberOfPeople = 1;
        }
        String symbolOfPeople = "";
        for (int i = 0; i < numberOfPeople; i++) {
            symbolOfPeople += "&";
        }
        System.out.println("Check amount:");
        double checkAmount = scan.nextDouble();

        System.out.println("Service Quality:");
        String serviceQuality = scan.next();

        if (serviceQuality.equalsIgnoreCase("Poor")) {
            tip = checkAmount * .05;
        } else if (serviceQuality.equalsIgnoreCase("Fair")) {
            tip = checkAmount * .1;
        } else if (serviceQuality.equalsIgnoreCase("Good")) {
            tip = checkAmount * .15;
        } else if (serviceQuality.equalsIgnoreCase("Great")) {
            tip = checkAmount * .2;
        } else if (serviceQuality.equalsIgnoreCase("Excellent")) {
            tip = checkAmount * .25;
        }

        totalToPay = tip + checkAmount;
        totalPerPerson = totalToPay / numberOfPeople;
        tipPerPerson = tip / numberOfPeople;

        System.out.println("Number of people entered: " + symbolOfPeople);
        System.out.println("Total to pay: " + totalToPay);
        System.out.println("Total tip: " + tip);
        System.out.println("Total per person: " + totalPerPerson);
        System.out.println("Tip per person: " + tipPerPerson);

    }
}
/*
Write a program for a tip calculator. There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

> Poor = 5%
> Fair = 10%
> Good = 15%
> Great = 20%
> Excellent = 25%

The program should display the following information based on the user input:

Split or No split (Yes or No)
Number of people entered: (number) (each person = & in output)
Check amount: (number)
Service Quality: (String)
Total to pay:
Total tip:
Total per person:
Tip per person:

```
Example

Input:
Yes
4
476.0
Excellent

Output:
Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
```
 */