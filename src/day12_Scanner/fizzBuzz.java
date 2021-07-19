package day12_Scanner;
/*
2. write a program that can print any number between 1 ~ 10,
but for number which is a multiple of 3 print "Fizz" instead of the number and for number which
is a multiple of 5, print "Buzz" instead of the number, and for number which is a multiple of
both 3 and 5 both print "FizBuzz" instead of the number.

                  MUST use switch statement
 */
public class fizzBuzz {
    public static void main(String[] args) {
        int number = 3;
        String response = "";

        switch(number){
            case 3:
            case 6:
            case 9:
                response ="Fizz";
                break;
            case 5:
            case 10:
                response = "Buzz";
                break;
            case 1:
                response = "One";
                break;
            case 2:
                response = "Two";
                break;
            case 4:
                response = "Four";
                break;
            case 7:
                response = "Seven";
                break;
            case 8:
                response = "Eight";
                break;
            default:
                response = "Invalid";
        }
        System.out.println("response = " + response);




    }
}
