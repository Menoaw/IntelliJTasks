package day05_ArithmeticOperators;

/*
find if a number is divisible by 3
 */

public class ArithmeticOperatorsPractice {
    public static void main(String[] args) {
        int a = 7;
        int divisibleBy = 5;
        boolean isDivisible = a%divisibleBy == 0;
        boolean isNotDivisible = a%divisibleBy > 0;

        System.out.println(a+" is evenly divisible by "+divisibleBy+" :"+isDivisible);
        System.out.println(a+" is not evenly divisible by "+divisibleBy+" :"+isNotDivisible);
        System.out.println("Remainder is :"+a%3);

        System.out.println("-----------------");


        System.out.println("isNotDivisible = " + isNotDivisible);

    }


}
