package day23_Arrays;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String[] days = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};

        System.out.println("Enter Number between 1-7:");
        int n = scan.nextInt();

        System.out.println(days[n-1]);

    }
}
