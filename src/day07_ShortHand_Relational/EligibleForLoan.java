package day07_ShortHand_Relational;

/*
income atleast 60k
atleast credit score 700
atleast 2 years work history
 atleast 18 years old

 */

public class EligibleForLoan {
    public static void main(String[] args) {

        String name = "Dave";
        int creditScore = 700;
        double income = 45000;
        int yearWorked = 7;
        int age = 49;

        boolean r3 = age >=18 && creditScore >=700 && ( yearWorked>=2 || income >= 60000);


        /*
        boolean r1 = income >= 60000 && yearWorked >=2;
        boolean r2 = age >=18 &&creditScore>=700;
        boolean isEligible = r1&&r2;
        */

        boolean isEligibleForLoan = age>=18 && yearWorked >=2 && income>=60000 &&creditScore>=700;

        System.out.println(name+" is eligible for a loan: "+isEligibleForLoan);

        System.out.println("r3 = " + r3);


    }
}
