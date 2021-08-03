package day39_CustomClass_Statics.salaryCalculatorTask;

import java.text.DecimalFormat;

public class SalaryCalculator {

    public double hourlyRate;
    public double stateTaxRate;
    public double federalTaxRate;
    public double weeklyHours;

    public void setInfo(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate/100;
        this.federalTaxRate = federalTaxRate/100;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        return hourlyRate * weeklyHours * 52;
    }

    public double stateTax(){
        return salary() * stateTaxRate;
    }

    public double federalTax(){
        return salary() * federalTaxRate;
    }

    public double salaryAfterTax(){
        return salary() - stateTax() - federalTax();
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.0");
        return "SalaryCalculator{" +
                "salary= $" + df.format( salary() ) +
                ", stateTax= $" + df.format(stateTax()) +
                ", federalTax= $" + df.format(federalTax()) +
                ", salaryAfterTax= $" + df.format(salaryAfterTax()) +
                '}';
    }

}


/*
SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours
        Actions:
            setInfo(): sets all the fields of SalaryCalculator
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
            stateTax(): calculates the totalstateTax
            federalTax(): calculates the total federal tax
            salaryAfterTax(): calculates the salary after tax
            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */