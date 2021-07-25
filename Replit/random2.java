import java.util.Arrays;
import java.util.Scanner;

public class random2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // your code
        // ------------------------------------------

        String guestName = "";
        String guestList = "";
        String continu = "";

        do {
            System.out.println("Please enter guest name:");
            guestName = scan.nextLine();
            guestList += ("Guest's list: " + guestName + ", ");

            System.out.println("Do you want to enter new guest name:");
            continu = scan.next();
        } while (continu.equalsIgnoreCase("Yes"));

        System.out.println(guestList);


    }
}
