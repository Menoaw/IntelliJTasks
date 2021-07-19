package day13_ScannerMethods;

        /*
        FreeShipping:
            price
                isPrime:
                    true: free shipping
                    false: 3.99 shipping
         */

import java.util.Scanner;

public class FreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter the price of the item: ");
        double price = scan.nextDouble();
        System.out.println("Are you a Prime member?");
        boolean isPrime = scan.nextBoolean();

        double totalPrice = (isPrime || price>=25) ? price: price+3.99;

        System.out.println("totalPrice = $" + totalPrice);


    }

}
