package day10_NestedIfStatements;
/*
Tasks:
    You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 - Your tank is full
                Above 80 - Still okay
                Above 70 - Don't go too far
                Above 60 - Start to head back
                Above 50 - Be careful now you at at 50%
 */
public class DivingTank {
    public static void main(String[] args) {
        int number = 40;
        String result = "";

        if (number >= 0 && number <= 100) {
            if (number >= 90) {
                result = "Your good";
            } else if (number >= 80) {
                result = "Still okay";
            } else if (number >= 70) {
                result = "Don't go too far";
            } else if (number >= 60) {
                result = "Start to head back";
            } else if (number >= 50) {
                result = "Be careful now you are at 50%";
            } else {
                result = "HURRY BEFORE YOU DIE";
            }
            System.out.println("result = " + result);


        }
    }
}
