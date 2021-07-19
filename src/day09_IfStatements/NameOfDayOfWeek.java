package day09_IfStatements;
 /*
 1. write program that can print out the name of the day based on the number 1 ~ 7
  */
public class NameOfDayOfWeek {
    public static void main(String[] args) {
        int day = 7;
        if(day==1){
            System.out.println("Sunday");
        }
        else if(day==2){
            System.out.println("Monday");
        }
        else if(day==3){
            System.out.println("Tuesday");
        }
        else if(day==4){
            System.out.println("Wednesday");
        }
        else if(day==5){
            System.out.println("Thursday");
        }
        else if(day==6){
            System.out.println("Friday");
        }
        else{
            System.out.println("Saturday");
        }




    }



}
