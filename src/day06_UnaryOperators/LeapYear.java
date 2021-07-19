package day06_UnaryOperators;
/*
2. create a class named LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
                year = 2020

            output:
                2020 is leap year: true

        Hint: if the number of years can be evenly divisible by 4, it's known as the leap year
 */
public class LeapYear {

    public static void main(String[] args) {

        int LeapYear = 2020;
        boolean isLeapYear = LeapYear%4 == 0;
        boolean isNotLeapYear = LeapYear%4 >0;
        // if the year is evenly divisible by 4, then it's a leap year.
        //remainder: 2012 - (4 * 53) = 0
        // operator precedence:
        // highest: *, /, %
        // lowest: -, +

        System.out.println(LeapYear+ " is leap year: "+isLeapYear);

    }
}
