package day37_CustomClasses;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
1. write a program that can swap the first and last elements of an ArrayList

2. write a program that can return the first unique elements of an ArrayList

3. write a program that can find the frequency of character from a String
                DO NOT use nested loop
                "AABBCCDDEE"  ==> "ABCDE"
                output: A2B2C2D2E2

4. Write a program that can return the nth largest number from an ArrayList of integers
 */
public class WarmupTasks {
    public static void main(String[] args) {

    //1. write a program that can swap the first and last elements of an ArrayList
        String[] names = {"Esraa","Sabir","Raphael","Mousa"};

        ArrayList<String> students = new ArrayList<>();

        students.addAll(Arrays.asList(names));

        System.out.println(students);

        Collections.swap(students, 0,students.size()-1);

        System.out.println(students);
        System.out.println("----------------------------------------------");
        //2. write a program that can return the first unique elements of an ArrayList

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,2,2,3,4,5,5,6,6,7,8,9,10));
        int firstUnique = 0;
        for (Integer each : list){
            if (Collections.frequency(list,each) == 1){
                firstUnique = each;
                break;
            }
        }
        System.out.println("first unique int: " +firstUnique);
        System.out.println("----------------------------------------------");
//      3. write a program that can find the frequency of character from a String
//                DO NOT use nested loop
//                "AABBCCDDEE"  ==> "ABCDE"
//                output: A2B2C2D2E2

        String str = "AABBCCDDEE";
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(list2);
        String result = "";
        for (String each : StringUtility.removeDup(str).split("")){
            int frequency = Collections.frequency(list2,each);
            result += each + frequency;
        }
        System.out.println(result);
        System.out.println("----------------------------------------------");
//      4. Write a program that can return the nth largest number from an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10));
        int n = 5;
        for (int i = 1; i < n; i++) {
            numbers.removeIf(p -> p == Collections.max(numbers));
        }
        int fifthMaxNumber = Collections.max(numbers);
        System.out.println(fifthMaxNumber);
    }
}
