package day12_Scanner;

import java.util.Scanner;

/*
Area
Perimeter
 */
public class Circle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Radius of the Circle: ");
        double radius = scan.nextDouble();
        double perimeter =2*3.14*radius;
        double area = 3.14 * (radius*radius);
        System.out.println("Area of the Circle is: "+ area);

        System.out.println("Perimeter of the Circle is: "+perimeter);



    }
}
