package day09_IfStatements;

public class PosNegZero {
    public static void main(String[] args) {
        int number = 2;
        if(number>0){
            System.out.println("positive");
        }
        else if(number<0) {
            System.out.println("negative");
        }
        else if(number==0){
            System.out.println("zero");
        }
        else{
            System.out.println("Fail.");
        }


    }





}
