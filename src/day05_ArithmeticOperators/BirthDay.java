package day05_ArithmeticOperators;

/*
3. Create a class named BirthDay and create the following variable
			 name, birthDay(int), birthMonth(String), birthYear(int)

			 use concatenation to display the birthday of the person

			 	if  name = "John"
			 		birthDay = 25
			 	    birthMonth = "April"
			 	    birthYear = 1995;

			 	output:
			 		John was born on April/25/1995.
 */
public class BirthDay {
    public static void main(String[] args) {

        String name = "John";
        int birthDay = 25;
        String birthMonth = "April";
        int birthYear = 1995;
        int year = 2021;

        System.out.println(name + " was born on " + birthMonth + "/" + birthDay + "/" + birthYear + ".");

        int age = year - birthYear;

        System.out.println("John is "+age+ " years old.");

    }


}
