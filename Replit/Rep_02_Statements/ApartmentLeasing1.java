package Rep_02_Statements;

import java.util.Scanner;

public class ApartmentLeasing1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");

        int numberOfBedrooms = scan.nextInt();
        int startingPrice = 0;

        int bedroom1 = 1100;
        int bedroom2 = 1850;
        int bedroom3 = 2550;

        if(numberOfBedrooms==1){
            startingPrice = bedroom1;
            System.out.println("One Bedroom Selected");
        }else if(numberOfBedrooms==2){
            startingPrice = bedroom2;
            System.out.println("Two Bedroom Selected");
        }else if(numberOfBedrooms==3){
            startingPrice = bedroom3;
            System.out.println("Three Bedroom Selected");
        }else{
            System.out.println("No such Bedrooms available");
        }
        System.out.println("Starting Price: "+startingPrice);


    }
}
