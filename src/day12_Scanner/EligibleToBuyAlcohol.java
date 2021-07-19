package day12_Scanner;

import java.util.Scanner;

public class EligibleToBuyAlcohol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Age: ");
        int age = input.nextInt();

        if (age >= 21){
            System.out.println("You can buy Alcohol!");
        }else{
            System.out.println("You cannot buy Alcohol");
        }



    }
}
