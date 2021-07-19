package day08_ifStatements;
/*
a,b,c,d,f. possible grades
A: 90 <= score <= 100
B: 80 <= score <= 89
C: 70 <= score <= 79
D: 60 <= score <= 69
F: score < 60

 */

public class GradeReport {
    public static void main(String[] args) {
        String name = "James";
        int score = 60;
        if (score >=90 && score <= 100){
            System.out.println("You made an A");
        }
        if (score >=80 && score <= 89){
            System.out.println("You made an B");
        }
        if (score >=70 && score <= 79){
            System.out.println("You made an C");
        }
        if (score >=60 && score <= 69){
            System.out.println("You made an D");
        }
        if (score <60){
            System.out.println("You made an F");
        }




    }
}
