package day34_LocalDateTime_Wrapper;

import java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        System.out.println(now);
        LocalTime breaktime = now.plusMinutes(15);
        System.out.println(breaktime);
        LocalTime quizDue = breaktime.plusMinutes(20);
        System.out.println(quizDue);

    }
}
