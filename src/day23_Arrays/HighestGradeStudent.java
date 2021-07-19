package day23_Arrays;

public class HighestGradeStudent {
    public static void main(String[] args) {

        int[] score = {85, 70, 95, 90, 100};
        String[] names = {"Mike", "Adam", "Tonny", "John", "Ammy"};
        int maxScore = score[0];
        int minScore = score[0];
        String maxScoreName = "";
        String minScoreName = "";
        for (int i = 0; i < score.length; i++) {
            String eachName = names[i];
            int eachScore = score[i];
            System.out.println(names[i] + ": " +score[i]);

            if(eachScore>maxScore){
                maxScore = eachScore;
                maxScoreName = eachName;
            }
            if(eachScore<minScore){
                minScore = eachScore;
                minScoreName = eachName;
            }

            }
        System.out.println(maxScore);
        System.out.println(maxScoreName);
        System.out.println(minScore);
        System.out.println(minScoreName);
        }


    }

