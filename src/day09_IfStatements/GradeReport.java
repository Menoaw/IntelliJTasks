package day09_IfStatements;

public class GradeReport {
    public static void main(String[] args) {

        int score = 99;
        if (score >=90 && score <= 100){
            System.out.println("Your Grade is: A");
        }
        else if (score >=80){
            System.out.println("Your Grade is: B");
        }
        else if (score >=70){
            System.out.println("Your Grade is: C");
        }
        else if (score >=60){
            System.out.println("Your Grade is: D");
        }
        else{
            System.out.println("Your Grade is: F");
        }





    }
}
