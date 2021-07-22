package day34_LocalDateTime_Wrapper;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/*
1. use the LocalDate & Time get the date and time in the following format:
            Tuesday, 1:00 pm, Nov/24/2020
 */
public class Task {
    public static void main(String[] args) {

        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");

        LocalDateTime a = LocalDateTime.now();
        System.out.println(a.format(DTF).replace("AM","am").replace("PM","pm"));
        System.out.println(a);




    }
}
