package day21_Loops;
/*
4. write a program that can retrive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */
public class DigitsLettersSpecial {
    public static void main(String[] args) {

        String str = "mn@#123Ab!";
        String letters = "";
        String digits = "";
        String specialChars= "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (each >= 'A' && each < 'Z' ){
                letters += each;
            }else if(each >='a' && each <='z'){
                letters += each;
            }else if(each >='0' && each <= '9'){
                digits += each;
            }else{
                specialChars+=each;
            }

        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);

    }
}
