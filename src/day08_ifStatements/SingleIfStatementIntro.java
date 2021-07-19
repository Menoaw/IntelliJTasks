package day08_ifStatements;

/*
Single If Statement:Syntax:
if (boolean){
   statements;
   }
 -----------------------------
if (score >= 50) {
                congratulate();
                }
 */

public class SingleIfStatementIntro {
    public static void main(String[] args) {


        String name = "Matthew";
        int score = 50;
        boolean passed = score >= 60;
        if (passed){ //if student passes
            System.out.println(name+" Congrats you passed the exam");
            };
        if (!passed){ //if student failed
            System.out.println(name+ " Failed.");
            };
        System.out.println("------------------");









    }

}