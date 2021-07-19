package day11_Switch;
/*
4. Given two double variables n1, n2 and a char variable named operator.
    use switch statement to calculate the result of n1 & n2 based on the given operator
        Valid operators are: -, +, *, /
 */
public class Calculator {
    public static void main(String[] args) {
        double n1 = 100;
        double n2 = 2.5;
        char mathOperator = '-'; //+,-,*,/
        double result = 0;


        switch(mathOperator){
            case '-':
                result = n1-n2;
                //System.out.println(n1-n2);
                break;
            case'+':
                result = n1+n2;
                //System.out.println(n1+n2);
                break;
            case'*':
                result = n1*n2;
                //System.out.println(n1*n2);
                break;
            case'/':
                result = n1/n2;
                //System.out.println(n1/n2);
                break;
            default:
                System.out.println("Invalid Input");
        }
        System.out.println("result = " + result);




    }
}
