package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
Task:
    1. create string array to have 5 of your classmate's names

    2. create an array that contains their DofB

    3. find out who is the youngest person

    4. find out who was born on leap year
 */
public class TaskLunch {
    public static void main(String[] args) {

        String[] students={"Ahmad","Gulistan","Yahya","Feruza","Nazli"};

        LocalDate[] DOB={
                                LocalDate.of(1987,10,10),
                                LocalDate.of(2000,1,1),
                                LocalDate.of(1991,1,9),
                                LocalDate.of(1993,6,17),
                                LocalDate.of(1990,3,20)
        };
        LocalDate youngest = DOB[0];
        int index = 0;

        for (int i = 0; i < students.length; i++) {
            if(DOB[i].isLeapYear()){
                System.out.println(students[i]+ " is born in a leap year.");
            }


            if(DOB[i].isAfter(youngest)){
                youngest = DOB[i];
                index = i;
            }
        }
        System.out.println(students[index] + " is the youngest, born on "+DOB[index]);
        System.out.println("-------------------------------------------");
        DateTimeFormatter DF = DateTimeFormatter.ofPattern("EEEE, MMM/dd/yyyy");

        for (int i = 0; i < students.length ; i++) {
            System.out.println(students[i]+" was born on "+DOB[i].format(DF));
        }


    }
}
