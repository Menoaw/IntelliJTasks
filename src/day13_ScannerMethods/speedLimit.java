package day13_ScannerMethods;

import java.util.Scanner;

/*
3. Write a program for the speed check. a variable named speedLimit is given and assigned,
    ask user to enter the current speed, if the current speed is over the speedLimit print slow down,
     otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!

            Enter current speed:
            45

            output:
 */
public class speedLimit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Current Speed: ");
        int currentSpeed = scan.nextInt();
        int speedLimit = 55;
        int speedOver = currentSpeed-speedLimit;
        if(speedOver>0){
            System.out.println("You're driving "+speedOver+" mph over the limit. Slow down!");
        }else{
            System.out.println("Go faster!");
        }





    }
}
