package Rep_00_Beginning;

import java.util.Scanner;

class CalenderSwitchAndIf {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month number:");
        int monthNum = scan.nextInt();

        //WRITE YOUR CODE HERE:
        String monthName = "";
        switch (monthNum) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "Febuary";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid month number";
                break;
        }
        System.out.println(monthName);
    }
}