package day09_IfStatements;
/*
  3. write a program that can find the number of days in a month (Assume that Feb has 28 days)
            Ex:
                month = 2

            output:
                    28 days

        Hints: you will need single if statements for:
              28 days: 2
              30 days: 4, 6, 9, 11
              31 days: 1, 3, 5, 7,8,10, 12
 */
public class DaysInMonth {
    public static void main(String[] args) {
        /*
        int month = 2;


        if (month==2){
            System.out.println(month+" month has 28 days");
        }
        if (month==4||month==6||month==9||month==11){
            System.out.println(month+" month has 30 days");
        }
        if (month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            System.out.println(month+" month has 31 days");
        }
        */

        int month = 12;
        boolean days28 = month==2;
        boolean days30 = month ==4||month ==6||month==9||month==11;
        boolean days31 = !days28 && !days30;

        if(days28){
            System.out.println(month+" month has 28 days");
        }
        if(days30){
            System.out.println(month+" month has 30 days");
        }
        if(days31){
            System.out.println(month+" month has 31 days");
        }






    }


}
