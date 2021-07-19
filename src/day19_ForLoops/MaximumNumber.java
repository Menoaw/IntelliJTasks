package day19_ForLoops;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -2147483648;   //whatever number given is higher than this number.
        for (int i = 1; i <=5 ; i++) {
            System.out.println("Enter Number: ");
            int n = scan.nextInt();
            if (n > max){
                max = n;
            }
        }





    }
}
