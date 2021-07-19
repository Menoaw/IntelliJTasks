package day13_ScannerMethods;

import java.util.Scanner;
/*
ShippingInfo
    ask the followings:
        1. Builder Number (nextInt)
        2. Street Address (nextLine)
        3. City Name  (nextLine)
        4. State ( next )
        5. Zip Code (next)
        6. Full Name

    print the shipping info of the person

    Ex:
        Aysu Ahmadil
        7925 Jones Branch Drive
        Mclean, VA 22012
 */
public class ShippingInfo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Building number:");
        int buildingNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Street Address:");
        String streetAddress = scan.nextLine();
        System.out.println("Enter City Name:");
        String cityName = scan.nextLine();
        System.out.println("Enter State:");
        String state = scan.next();
        scan.nextLine();
        System.out.println("Enter Zip Code:");
        String zipCode = scan.nextLine();
        System.out.println("Enter Full Name:");
        String fullName = scan.nextLine();

        System.out.println(fullName);
        System.out.println(buildingNumber+" "+streetAddress);
        System.out.println(cityName+", "+state+" "+zipCode);

    }
}
