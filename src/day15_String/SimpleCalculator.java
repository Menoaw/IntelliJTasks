package day15_String;

import java.util.Scanner;

/*
1. num1
2. math operator
3. num2
 */
public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = scan.nextDouble();
        System.out.println("Enter math operator:");
        char mathOperator = scan.next().charAt(0);
        System.out.println("Enter second number");
        double num2 = scan.nextDouble();
        double result = 0;
        switch(mathOperator){
            case '-':
                result = num1 - num2;
                break;
            case '+':
                result = num1 + num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
        }

        System.out.println(result);


    }
}
