package day11_Switch;

public class PassOrFail {
    public static void main(String[] args) {
        char grade = 'A';

        /*
        Pass: A,B,C,D
        Fail: F
         */
        switch (grade){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("You Passed The Exam");
                break;
            case 'F':
                System.out.println("You Failed The Exam");
                break;
            default:
                System.out.println("Invalid Grade");
                break;
        }




    }
}
