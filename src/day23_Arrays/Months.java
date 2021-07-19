package day23_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Months {
    public static void main(String[] args) {


        String[] month = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of the month here:");
        int n = scan.nextInt()-1;
        if(n >0 &&n< month.length) {
            System.out.println(month[n]);
        }else {
            System.out.println("Invalid Month");
        }

    }
}
