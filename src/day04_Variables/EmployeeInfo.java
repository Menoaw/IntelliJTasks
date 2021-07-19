package day04_Variables;
/*

Task:
    1. create a class named EmployeeInfo
                1. declare the following variables:
                    name, gender, age, companyName, jobTitle, isFullTime, isMarried, salary

                2. full info of the employee
 */

public class EmployeeInfo {
    public static void main(String[] args) {

        String firstName = "Christian";
        String lastName = "Cain";
        String fullName = firstName + " " + lastName;
        String gender = "Male"; //alternatively char gender = 'M'
        int age = 26;
        String companyName = "Apple Inc";
        String jobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = true;
        double salary = 110000;
        // Aaron King
        // Employee' full name is: Aaron King
        System.out.println("Employee' full name is: " + fullName);

        // Aaron King is Male (Changed name at this point)
        System.out.println(fullName + " is " +gender);

        // fullName is age years old
        System.out.println(fullName + " is " +age+" years old");

        // fullName works at companyName
        System.out.println(fullName + " works at "+companyName);

        //fullName is jobTitle
        System.out.println(fullName+" is "+jobTitle);

        //fullName is isFullTime
        System.out.println(fullName + " is full time employee: " + isFullTime);

        //fullName is isMarried
        System.out.println(fullName + " is married: "+isMarried);

        System.out.println(fullName+ " is making $"+salary);

    }


}
