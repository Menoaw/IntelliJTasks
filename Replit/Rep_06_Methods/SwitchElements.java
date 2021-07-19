package Rep_06_Methods;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
Implement the **do_switch** method
Switch the last element in an array with the first and return the array.
Examples:
do_switch([1,2,3,4])
returns:[4,2,3,1]
```
do_switch([7,2,3,5])
returns:[5,2,3,7]
 */
public class SwitchElements {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};
        Arrays.toString(do_switch(arr));

    }


    public static int[] do_switch(int[] i) {
        // your codes here:
        int[] arr2 = new int[i.length];
        arr2[0] = i[i.length-1];
        arr2[arr2.length-1]= i[0];
        for (int j = 1,z = 1; j < i.length-1; j++, z++) {
            arr2[j] = i[z];
        }
        System.out.println(Arrays.toString(arr2));
        return arr2;

    }
}
