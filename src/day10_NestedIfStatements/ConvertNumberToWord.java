package day10_NestedIfStatements;

public class ConvertNumberToWord {
    public static void main(String[] args) {
        // 0 - 9

        int number = 25;
        String word = "";
        if (number >= 0 && number <= 9) {
            if (number == 0) {
                word = "Zero";
            } else if (number == 1) {
                word = "One";
            } else if (number == 2) {
                word = "Two";
            } else if (number == 3) {
                word = "Three";
            } else if (number == 4) {
                word = "Four";
            } else if (number == 5) {
                word = "Five";
            } else if (number == 6) {
                word = "Six";
            } else if (number == 7) {
                word = "Seven";
            } else if (number == 8) {
                word = "Eight";
            } else {
                word = "Nine";
            }
        } else {
            word = "Invalid";
        }
        System.out.println(word);
    }


}

