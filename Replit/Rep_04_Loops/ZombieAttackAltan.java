package Replit.Rep_04_Loops;

import java.util.Scanner;

public class ZombieAttackAltan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        //code here

        int days = 0;
        if (inhabitants>0){
            for (int i = 0; i < 10; i++) {
                System.out.println("Day "+days+" ["+inhabitants+"]");
                days++;
                inhabitants = inhabitants/2;
                if(inhabitants==0){
                    break;
                }
            }
        }if (inhabitants==0){
            System.out.println("---- EXTINCT ----");
        }




    }
}
