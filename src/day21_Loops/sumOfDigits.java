package day21_Loops;
/*
3. Write a program that can return the sum of digits from a string
             Ex:
                 input: A1B2C3

                 output:    6
 */
public class sumOfDigits {
    public static void main(String[] args) {

        String str = "A1B2C3";
        int sum = 0;
        for (int i = 0; i <=str.length()-1 ; i++) {
            char each = str.charAt(i);
            //System.out.println("each = " + each);
                if (each>= '0' & each <= '9'){
                    sum+= each-48; //also works with - '0' changes character to integer (ascii table)
                }

        }
        System.out.println(sum);


    }
}
