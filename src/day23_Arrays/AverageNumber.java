package day23_Arrays;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {

        System.out.println("How many numbers do you want to enter?");
        Scanner scan = new Scanner(System.in);
        int[] n = new int[scan.nextInt()];
        int total = 0;


        for (int i = 0; i < n.length; i++) {
            System.out.println("Enter number:");
            n[i] = scan.nextInt();
            total+=n[i];

        }
        double avg = (double)total/n.length;
scan.close();
        System.out.println("total: " + total);
        System.out.println("average: "+avg);
    }
}
