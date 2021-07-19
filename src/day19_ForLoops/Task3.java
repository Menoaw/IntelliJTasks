package day19_ForLoops;

import java.util.Scanner;

/*
3. print the following shape:
                        * * * * * *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        * * * * * *

    Hint: in the loop body , only place the statements that you need to repeat
 */
public class Task3 {
    public static void main(String[] args) {

        System.out.println("\t\t* * * * * *");
        for (int i = 1; i <=8; i++) {
            System.out.println("\t\t*         *");
        }
        System.out.println("\t\t* * * * * *");
        System.out.println("-----------------------------");
        /*
        int sum = 0;

        for (int i = 1; i <=100 ; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
        System.out.println("-----------------------------");
*/

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);




    }
}
