package day10_NestedIfStatements;

public class EligibleToVote {
    public static void main(String[] args) {
        //eligibleToBuyAlcohol
        int age = 23;
        String result = "";
        result = (age >=21)? "Eligible" : "Ineligible";
        System.out.println("result = " + result);
        System.out.println("-----------------------");

        int score = 80;
        System.out.println(  (score>=60) ? "Passed" : "Failed");
        System.out.println("-----------------------");


        int number = 100;
        String result3 = "";


        // ? if keyword     : else keyword.     condition needs to be before ?

        String eligibleToBuyAlcohol = "";
        String citizenship = "USA";
       // eligibleToBuyAlcohol = (age >=21 && citizenship== "USA")


    }
}
