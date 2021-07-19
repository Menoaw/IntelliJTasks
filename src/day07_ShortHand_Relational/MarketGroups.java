package day07_ShortHand_Relational;
/*
        max score 60.
        50-60 = early bird
        40-49 = group 1
        30-39 = group 2
        <30 = angryBirds

 */


public class MarketGroups {
    public static void main(String[] args) {
        String name ="Bob";
        int score = 22;
        boolean isEarlyBird = score>= 50 && score<=60;
        boolean isGroup1 = score>= 40 && score<=49;
        boolean isGroup2 = score>= 30 && score<=39;
        boolean isAngryBird = score<30;

        System.out.println("isEarlyBird = " + isEarlyBird);
        System.out.println("isGroup1 = " + isGroup1);
        System.out.println("isGroup2 = " + isGroup2);
        System.out.println("isAngryBird = " + isAngryBird);


    }
}
