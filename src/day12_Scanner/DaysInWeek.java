package day12_Scanner;

import java.util.Scanner;

/*
1-7
 */
public class DaysInWeek {
    public static void main(String[] args) {

        System.out.println("Enter Day: ");
        Scanner number = new Scanner(System.in);
        int day = number.nextInt();
        String result = "";

        if (day >= 1 && day <= 7) {
            result = (day == 1) ? "Monday" : (day == 2) ? "Tuesday" : (day == 3) ? "Wed" :
                    (day == 4) ? "Thur" : (day == 5) ? "Fri" : (day == 6) ? "Sat" : "Sun";
        }
        System.out.println("result = " + result);
    }
}
