package day10_NestedIfStatements;

public class TernaryPractice2 {
    public static void main(String[] args) {
        int number = 100;
        String result3 = "";

        result3 = (number>0)? "Positive" :(number<0)? "Negative":"Zero";

        System.out.println("-----------------------");

        int score = 100;
        char grade = ' ';

        grade = (score>=90)? 'A':(score>=80)? 'B':(score>=70)?'C':(score>60)?'D' : 'F';
        System.out.println("grade = " + grade);



    }
}
