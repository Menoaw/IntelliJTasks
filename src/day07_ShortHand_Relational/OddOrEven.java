package day07_ShortHand_Relational;

public class OddOrEven {
    public static void main(String[] args) {

        int num = 16;
        boolean even = num%2 == 0;
        boolean odd = num%2 != 0;
        // even == false; //if the number is not even, then its odd number


        System.out.println(num +" is even = " + even);
        System.out.println(num+" is odd = " + odd);



    }
}
