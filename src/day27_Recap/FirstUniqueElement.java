package day27_Recap;

public class FirstUniqueElement {
    public static void main(String[] args) {

        int[] array = {1, 1, 2, 3, 3, 4, 1, 1, 1, 1};

        int firstUnique = 0;
        for (int j = 0; j < array.length; j++) {

            int frequency = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == array[j]) {
                    frequency++;

                }
            }
            if(frequency==1){
                firstUnique=array[j];
                break; // returns only first unique, otherwise will print whatever is the last unique
            }
        }
        System.out.println("firstUnique = " + firstUnique);


    }
}
