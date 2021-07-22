package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {
    public static void main(String[] args) {

/*
LocalDate:
    year:yyyy
    month:MM,MMM,MMMM
    day:dd
    name of day:E,EEEE

 */
        //  MM/dd/yyyy : 7/22/2021

        DateTimeFormatter DF = DateTimeFormatter.ofPattern("MM/dd/yyyy EEEE"); //MM number month, MMMM name of month, MMM 3 letters of Month
                                                                //E = Thu, EEEE = Thursday
        LocalDate today = LocalDate.now();
        String todaysDateFormatted = today.format(DF);

        System.out.println(today.format(DF)); //07/22/2021
        System.out.println(todaysDateFormatted); //07/22/2021
        System.out.println(today); //2021-07-22
        System.out.println("----------------------------------------------");
/*
LocalTime:
    hour: hh
    minutes: mm
    seconds: ss
    am/pm : a
 */
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter TF = DateTimeFormatter.ofPattern("hh:mm a");

        System.out.println(currentTime);
        String currentTimeFormatted = currentTime.format(TF);
        System.out.println(currentTimeFormatted);

        LocalTime time1 = LocalTime.of(17,25);
        System.out.println(time1.format(TF));

        System.out.println("-------------------------------------");

        System.out.println(LocalDate.of(2022,1,1).format(DateTimeFormatter.ofPattern("EEEE")));

        String result = LocalDate.of(1989,12,11).format(DateTimeFormatter.ofPattern("EEEE"));
        System.out.println(result);



    }
}
