import java.util.Scanner;

public class Random {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        // your code
        // ------------------------------------------

        String guestName = "";
        String guestList = "Guest's list: ";
        String continu = "";

        do {
            System.out.println("Please enter guest name:");
            guestName = scan.nextLine();
            guestList += guestName + ", ";


            System.out.println("Do you want to enter new guest name:");
            continu = scan.nextLine();
        } while (continu.equalsIgnoreCase("Yes"));

        System.out.println(guestList);


    }

}
