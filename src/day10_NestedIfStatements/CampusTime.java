package day10_NestedIfStatements;
/*
1. Campus time: User enters a time(hour in 24 hour format) and will be able to find out if the campus is open or not.
            Campus is open from 8 am(8) to 11 pm (23) If user enters a time within the open time they should see message: “open”
            but if the time entered is outside of operating hours they should see: “ closed”
 */
public class CampusTime {
    public static void main(String[] args) {
        int hour = 23;
        String result = "";
        if(hour>=8&&hour<=23){
            //System.out.println("Open");
            result = "Open";
        }
        else{
            result = "Closed";
        }



    }
}
