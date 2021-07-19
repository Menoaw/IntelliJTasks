package Replit.Rep_06_Methods;

import java.util.Arrays;
import java.util.Scanner;

/*
Given a time in 12 hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

The **timeConversion** method should convert and print the given number (String argument)

```
Input: 07:05:45PM

Output: 19:05:45
```

```
Input: 07:15:55AM

Output: 07:15:55
```
 */
public class TimeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //timeConversion(scan.nextLine());
        timeConversion("12:00:00PM");
    }

    //12:34:45PM
    public static void timeConversion(String s) {
        //Write your code here.
        String timeArr[] = s.split(":");
        boolean isPM = false;
        int hr = Integer.valueOf(timeArr[0]);
        if (timeArr[2].contains("PM")) {
            isPM = true;
            timeArr[2].replace("PM", "");
            timeArr[2] = timeArr[2].substring(0, 2);
        }
        if (timeArr[2].contains("AM")) {
            timeArr[2].replace("AM", "");
            timeArr[2] = timeArr[2].substring(0, 2);
        }
        if (isPM == true&&hr!=12) {
            hr = hr + 12;
            if (hr == 24) {
                timeArr[0] = "00";
            } else {
                timeArr[0] = "" + hr;
            }
            //System.out.println(hr);
        }else if(isPM==true&&hr==12){
            timeArr[0] = "" + hr;
        }
        if(isPM==false&&hr==12){
            timeArr[0] = "00";
        }

        System.out.println(timeArr[0] + ":" + timeArr[1] + ":" + timeArr[2]);

    }

}



