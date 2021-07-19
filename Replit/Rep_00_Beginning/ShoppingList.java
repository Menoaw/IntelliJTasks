package Rep_00_Beginning;

import java.util.Scanner;

/*
In this assignment you will write a program to create a shopping list and prices.

You will use Scanner object and ask user to enter 3 items followed by its price and you will
 calculate total price and show as a report.

-Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice

-Create a Scanner object named scan.
 */
public class ShoppingList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String item1 = scan.next();
        double price1 = scan.nextDouble();
        String item2 = scan.next();
        double price2 = scan.nextDouble();
        String item3 = scan.next();
        double price3 = scan.nextDouble();
        String report = "";


    }
}
