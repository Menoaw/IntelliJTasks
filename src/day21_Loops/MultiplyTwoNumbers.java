package day21_Loops;

import java.util.Scanner;

public class MultiplyTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int second = scan.nextInt();
        int result = 0;
scan.close();
        if(second<0) {
            second *= -1;
        }
        for (int i = 0; i < second; i++) {
            result += first;

        }
        System.out.println("result = " + result);
    }
}
