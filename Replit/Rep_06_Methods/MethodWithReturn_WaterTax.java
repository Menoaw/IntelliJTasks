package Replit.Rep_06_Methods;

import java.util.Scanner;

/*
The waterTax method calculates a water bill. The method takes a double and returns a double.

The more water you use the more it will cost you

Cost under 50:

bill = units * 0.60;
bill = units * 0.60;
Cost above 50:

bill = units * 0.90;
bill = units * 0.90;
Cost above 100 the calculation is same as above 50 but an additional 50 fine

Cost above 150 its the same as above 50 but an additional 100 fine

Examples:

waterTax(50)

returns 30
waterTax(50)

returns 30
waterTax(55)

returns 49.5
waterTax(55)

returns 49.5
waterTax(101)

returns 140.9
waterTax(101)

returns 140.9
waterTax(151)

returns 235.9
 */
public class MethodWithReturn_WaterTax {
    public static double waterTax(double units) {
        double bill = 0.0;

        //your code here
        if (units<=50.0){
            bill = units*.6;
        }else if(units>50.0){
            bill = units*.9;
        }
        if (units>=100.0&&units<150.0){
            bill+=50.0;
        }else if(units>150.0){
            bill += 100.0;
        }


        //end your code here

        return bill;
    }//end waterTax

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(waterTax(in.nextDouble()));

    }
}