package day12_Scanner;
import java.util.Scanner;

/*
Scanner: used to get user inputs, found in java util package.

Syntax:
    import      java.util.  Scanner
    Keyword      Package     class

    Scanner VariableName = new Scanner(System.in);
 */
public class ScannerIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("print here: ");
        int num1 = input.nextInt();
        System.out.println("print here: ");
        int num2 = input.nextInt();
        int addition = num1+num2;
        int subtraction =num1-num2;
        int multiplication = num1*num2;
        int division = num1/num2;

        System.out.println("addition = " + addition);
        System.out.println("subtraction = " + subtraction);
        System.out.println("multiplication = " + multiplication);
        System.out.println("division = " + division);





    }
}
