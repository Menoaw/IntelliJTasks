package day12_Scanner;

import java.util.Scanner;

public class EligibilityToVote {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Age: ");
        int age = input.nextInt();
        System.out.print("Enter your Country: ");
        String location = input.next();
        boolean eligibility = age>=21 && location =="USA";
        /*
        If(eligibility){
            System.out.println("You Can Vote!");
        }else{
            System.out.println("You Cannot Vote!");
        }
        */




    }
}
