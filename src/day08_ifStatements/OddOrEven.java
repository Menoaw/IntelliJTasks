package day08_ifStatements;

public class OddOrEven {
    public static void main(String[] args) {
        int number = 101;

        boolean isOdd = number%2 !=0;
        if (isOdd){
            System.out.println(number+ " is odd number");
        }
        if (!isOdd){
            System.out.println(number + " is even number");
        }




    }


}
