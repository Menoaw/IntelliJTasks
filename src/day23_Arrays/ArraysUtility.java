package day23_Arrays;


import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        //toString ---- used to print entire array
        int[] array = {1,2,3,4,5,6};
        System.out.println(array);
        System.out.println(Arrays.toString(array));

        String[] array2 = new String[5];

        System.out.println(Arrays.toString(array2));

        int[] nums = new int[5];
        System.out.println(Arrays.toString(nums));

        //sort()

        String[] students = {"Matt","Bat","Cat","Zat"};
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);

        System.out.println(Arrays.toString(students));

        int[] numbers = {9,10,4,1,3,-1,0,1,2};
        System.out.println( Arrays.toString(numbers) );
        Arrays.sort(numbers);

        System.out.println( Arrays.toString(numbers) );
        System.out.println("Minimum number: "+numbers[0]);
        System.out.println("Maximum Number: "+numbers[numbers.length-1] );

        char[] chars = {'z', 'b',  'k', 'a', 'c', 'y',  'x'};
        System.out.println( Arrays.toString(chars) );

        Arrays.sort(chars);
        System.out.println( Arrays.toString(chars) );

        //equals

        int[] a1 = {1,2,3};
        int[] a2 = {2,1,3};
        boolean r1 = Arrays.equals(a1,a2);
        System.out.println("r1 = "+r1);

        int[] a3 = {1,2,3};
        int[] a4 = {1,2,3};
        boolean r2 = Arrays.equals(a3,a4);
        System.out.println("r2 = "+r2);
        Arrays.sort(a1);
        Arrays.sort(a2);

        System.out.println("are first two arrays equal now? "+Arrays.equals(a1,a2));



    }
}
