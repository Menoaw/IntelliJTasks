package day05_ArithmeticOperators;

/*
Odd: if a number is not evenly divisible by 2
    ex. 11
Even: if a number is evenly divisible by 2
    ex. 2,4,6,8

operators : > greater than, == equal, etc.
 */

public class OddOrEven {
    public static void main(String[] args) {
        int number = 200;
        boolean isEven = number%2 == 0; // if the remainder of number/2 is equal to zero then number is even.
        boolean isOdd = number%2 >0; //if remainder of number/2 is greater than zero then number is odd.


        System.out.println(number + " is an even number: "+ isEven);
        System.out.println(number + " is an odd number: "+ isOdd);



    }


}
