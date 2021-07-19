package day24_Arrays;

/*
3. write a program that can print out the unique numbers from an array of integers
        Ex:
            int[] arr ={1,1,2,3,3,4}
            output:
                2 4
 */
public class FrequencyOfElements {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 4};


        for (int j = 0; j < arr.length; j++) {


            int element = arr[j]; //1
            int count = 0; //stores frequency
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == element) { // if element is in array
                    count++;
                }
            }

            if (count == 1) {
                System.out.print(element+" ");
            }
        }

    }
}
