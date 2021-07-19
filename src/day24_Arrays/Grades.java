package day24_Arrays;

import java.util.Arrays;

public class Grades {
    public static void main(String[] args) {

        String [] names = {"Anna", "Nancy", "Sarah", "Abbos", "Yuliang", "Raphael", "Tamerlan", "Muhtar", "Jack"};
        int [] scores = {90, 75, 80, 85, 91, 92, 93, 45, 65};
        char[] grades = new char[names.length]; //{A, C, B}
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;
        int gradeE = 0;
        int gradeF = 0;
        int sumOfGrades = 0;


        for (int i = 0; i < names.length; i++) {
            sumOfGrades+=scores[i];
            if (scores[i]>=90){
                grades[i] = 'A';
                gradeA++;
            }else if(scores[i]>=80) {
                grades[i] = 'B';
                gradeB++;
            }else if(scores[i]>=70) {
                grades[i] = 'C';
                gradeC++;
            }else if(scores[i]>=60) {
                grades[i] = 'D';
                gradeD++;
            }else if(scores[i]>=50) {
                grades[i] = 'E';
                gradeE++;
            }else{
                grades[i] = 'F';
                gradeF++;
            }

            System.out.println(names[i]+ " got a score of: "+scores[i]+ " and their grade is: "+grades[i]);
        }
        double avg = (double)sumOfGrades/ names.length;
        System.out.println("Grade Average is: "+avg);
        System.out.println("------------------------------------------");
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.toString(grades));
        System.out.println("------------------------------------------");


    }
}
