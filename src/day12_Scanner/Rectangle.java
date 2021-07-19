package day12_Scanner;


import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter width of Rectangle: ");
        int width = scan.nextInt();
        System.out.print("Enter length of Rectangle: ");
        int length = scan.nextInt();

        int areaOfRectangle = width*length;
        int perimeterOfRectangle = (width+length)*2;

        System.out.println("areaOfRectangle = " + areaOfRectangle);
        System.out.println("perimeterOfRectangle = " + perimeterOfRectangle);


    }
}
