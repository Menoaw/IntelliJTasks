package Replit.Rep_04_Loops;

import java.util.Scanner;

/*
Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)

Ask for the first guest name.

Then ask does user want to enter one more guests.

 If yes - take the next guest input

If not - finish the program and print list of the guests.

Example:

```
Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no
Guest's list: Nick, Linda
```
 */
public class Party {
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
