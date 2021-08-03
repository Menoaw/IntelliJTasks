package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class CollectionUtilities {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 10, 5, 0, -1, 30, 40, 15));
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.swap(list, 0, 7);
        System.out.println(list);
        Collections.replaceAll(list, 10, 100);
        System.out.println(list);
        Collections.frequency(list, 100); // doesnt really work this way, returns an int.
        System.out.println(Collections.frequency(list, 100));
        System.out.println("--------------------------------");
        ArrayList<Integer> uniques = new ArrayList<>();
        uniques.removeIf(p -> Collections.frequency(uniques, p) != 1);
        System.out.println(uniques);
        System.out.println("--------------------------------");
        String str = "ABABABABACDEEEE";
        String unique = "";
        ArrayList<String> result = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(result);
        for (String each : result) {
            if (Collections.frequency(result, each) == 1) {
                unique += each;
            }
        }
        result.removeIf(p -> Collections.frequency(result, p) != 1);
        System.out.println(unique);
        System.out.println(result);

    }
}
