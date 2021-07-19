package day08_ifStatements;
/*
a,b,c,d,f. possible grades
A: 90 <= score <= 100
B: 80 <= score <= 89
C: 70 <= score <= 79
D: 60 <= score <= 69
F: score < 60
 */
public class GradeReport2 {
    public static void main(String[] args) {
        int score = 90;
        boolean madeA = score >= 90 && score <= 100;
        boolean madeB = !madeA && score >= 80; //did not make A and score is greater than or equal to 80
        boolean madeC = !madeA && !madeB && score >=70; // also possible !madeB && score >=70
        boolean madeD = !madeA && !madeB && !madeC && score >=60; // !madeC && score >= 60
        boolean madeF = !madeA && !madeB && !madeC && !madeD ; // !madeD && score > 60



        if (madeA){
            System.out.println("You made an A");
        }
        if (madeB){
            System.out.println("You made an B");
        }
        if (madeC){
            System.out.println("You made an C");
        }
        if (madeD){
            System.out.println("You made an D");
        }
        if (madeF){
            System.out.println("You made an F");
        }




    }



}
