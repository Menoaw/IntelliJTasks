package day10_NestedIfStatements;

public class DaysInWeek {
    public static void main(String[] args) {
        int day = 9;
        String result ="";
        if(day >=1 && day<=7) {
            result = (day==1)?"Monday":(day==2)?"Tuesday":(day==3)?"Wed":
                        (day==4)?"Thur":(day==5)?"Fri":(day==6)?"Sat":"Sun";
            /*
            if (day == 1) {

                result = "Sunday";
            } else if (day == 2) {
                result = "Monday";
            } else if (day == 3) {
                result = "Tuesday";
            } else if (day == 4) {
                result = "Wednesday";
            } else if (day == 5) {
                result = "Thursday";
            } else if (day == 6) {
                result = "Friday";
            } else {
                result = "Saturday";
            }

             */
        }
        else{ result = "Invalid";}
        System.out.println("result = " + result);


    }
}
