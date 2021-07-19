package day10_NestedIfStatements;
/*
A: 90 <= score <= 100
B: 80 <= score <= 89
C: 70 <= score <= 79
D: 60 <= score <= 69
F: score < 60
 */
public class GradeReport {
    public static void main(String[] args) {

        int score = 50;
        String grade = ""; //a,b,c,d,f

        if(score>= 0 && score<=100){
            if(score>=90){
                grade = "A";
            }
            else if(score>=80){
                grade = "B";
            }
            else if(score>=70){
                grade = "C";
            }
            else if(score>=60){
                grade = "D";
            }
            else{
                grade = "F";
            }

        }
        else{ grade = "Invalid";}
        System.out.println("grade = " + grade);











    }
}
