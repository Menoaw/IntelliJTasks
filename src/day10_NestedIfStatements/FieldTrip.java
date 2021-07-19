package day10_NestedIfStatements;
/*
4. Your school goes on a Field trip each year. The place you go will be based on your grade.
Given some grade number (1-6) figure out the details of your field trip. Print the information at the end.

                Data based on grade:

                    grade - 1
                    location -  Apple orchard
                    number of groups - 3
                    teacher in charge - Ms. Smith

                    grade - 2
                    location - Zoo
                    number of groups - 7
                    teacher in charge - Mr. Lee

                    grade - 3
                    location - Aquarium
                    number of groups - 5
                    teacher in charge - Ms. Wilson

                    grade - 4
                    location - Movie theater
                    number of groups - 2
                    teacher in charge - Ms. Reyes

                    grade - 5
                    location - Museum
                    number of groups - 5
                    teacher in charge - Ms. Lela

                    grade - 6
                    location - Six Flags
                    number of groups - 8
                    teacher in charge - Mr. Watt
 */
public class FieldTrip {
    public static void main(String[] args) {
        int grade = 7;
        String location = "";
        String numberOfGroups = "";
        String teacherInCharge = "";

        if(grade>=1 && grade <=6){
            if(grade==1){
                location = "Apple Orchard";
                numberOfGroups = ""+3;
                teacherInCharge = " Ms. Smith";
            }
            else if(grade==2){
                location = "Zoo";
                numberOfGroups = ""+7;
                teacherInCharge = "Mr. Lee";
            }
            else if(grade==3){
                location = "Aquarium";
                numberOfGroups = ""+5;
                teacherInCharge = "Ms. Wilson";
            }
            else if(grade==4){
                location = "Movie theater";
                numberOfGroups = ""+2;
                teacherInCharge = "Ms. Reyes";
            }
            else if(grade==5){
                location = "Museum";
                numberOfGroups = ""+5;
                teacherInCharge = "Ms. Lela";
            }
            else if(grade==6){
                location = "Six Flags";
                numberOfGroups = ""+8;
                teacherInCharge = "Mr. Watt";
            }
            System.out.println("grade = " + grade);
            System.out.println("location = " + location);
            System.out.println("numberOfGroups = " + numberOfGroups);
            System.out.println("teacherInCharge = " + teacherInCharge);

        }else{
            System.out.println("Invalid");
        }








    }



}
