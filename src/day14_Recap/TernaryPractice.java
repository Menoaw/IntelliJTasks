package day14_Recap;

public class TernaryPractice {
    public static void main(String[] args) {


        System.out.println("Enter Number of day: ");
        int n = 1;

        String name = (n>=1 && n <=7)?
                (n == 1)? "Monday":
                (n == 2)? "Tuesday":
                (n == 3)? "Wednesday":
                (n == 4)? "Thursday":
                (n == 5)? "Friday":
                (n == 6)? "Saturday":"Sunday"
                :"Invalid Day";


        }
    }

