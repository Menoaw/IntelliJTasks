package day21_Loops;

public class WhileLoopPractice {
    public static void main(String[] args) {

        String str = "Java Java Java Java";
        int countJava = 0;
        while(str.contains("Java")){
            countJava++;
           str = str.replaceFirst("Java", "");
        }
        System.out.println("countJava = " + countJava);
    }


}
