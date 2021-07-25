package day35_ArrayList;


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {

    public static void main(String[] args) {
        int[] nums = new int[10]; // size is 10 fixed
        System.out.println(Arrays.toString(nums));

        ArrayList<Integer> numbers = new ArrayList<>(); // size is 0
        numbers.add(10);//autoboxing
        numbers.add(20);//autoboxing
        numbers.add(30);//autoboxing
        numbers.add(numbers.size(), 40);//autoboxing, forcing to be at index 2. //10,20,40,30
        System.out.println(numbers);
        System.out.println(numbers.get(3));
        System.out.println("------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }


    }


}