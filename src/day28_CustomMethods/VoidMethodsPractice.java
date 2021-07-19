package day28_CustomMethods;
/*
1. create a method that can print odd numbers between 1~100 in a same line seperated by space

	2. create a method that can print even numbers between 1~100

	3. create a method that can calculate the age of the person

	4. check eligibility to vote
 */
public class VoidMethodsPractice {
    public static void main(String[] args) {

        oddNumbers(50,60);
        evenNumbers(60,70);
        calculateAgeOfPerson(1989,2021);
        eligibleToVote(24,false);


    }

    public static void oddNumbers(int from, int to){
        for (int i = from; i <=to ; i++) {
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void evenNumbers(int from, int to){
        for (int i = from; i <=to ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void calculateAgeOfPerson(int birthYear, int currentYear){
        System.out.println("Your age is: "+ (currentYear-birthYear));
    }

    public static void eligibleToVote(int age, boolean isCitizen){
        if (age>=21 && isCitizen==true){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not Eligible to vote");
        }
    }


}
