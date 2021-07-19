package day10_NestedIfStatements;
/*
2. Write a program that can calculate the salary after tax based on the following requirements.
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax, otherwise pays 5% extra tax
 */
public class SalaryAfterTax {
    public static void main(String[] args) {
        double salary = 100000;
        boolean isMarried = false;
        double taxRate = 0;


        if(salary>=130000){
            taxRate = .35;
        }
        else if(salary>=100000){
            taxRate = .3;
        }
        else if(salary>=80000){
            taxRate = .25;
        }
        else{
            taxRate = .2;
        }

        if(isMarried){
            taxRate -=.05;
        }
        double salaryAfterTax = salary - (salary*taxRate);
        System.out.println("salaryAfterTax = " + salaryAfterTax);

        /*
        if(salary>=130_000){

            salary=salary*.65;
            if(isMarried == true){salary=salary*.95;}
            else{salary = salary*1.05;}
            System.out.println("salary after tax is: "+salary);
        }
        else if(salary>=100000&&salary<130000){
            salary = salary * .7;
            if(isMarried == true){salary=salary*.95;}
            else{salary = salary*1.05;}
            System.out.println("salary after tax is: "+salary);
        }
        else if(salary>=80000&&salary<100000){
            salary = salary * .75;
            if(isMarried == true){salary=salary*.95;}
            else{salary = salary*1.05;}
            System.out.println("salary after tax is: "+salary);
        }
        else {
            salary = salary * .8;
            if(isMarried == true){salary=salary*.95;}
            else{salary = salary*1.05;}
            System.out.println("salary after tax is: "+salary);
        }
         */




    }


}
