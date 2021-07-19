package day14_Recap;
/*
Given a  char variable determine if the character is letter or digit or special character.
            Ex: 'b'  --> letter
                '9'  --> digit
                '!'  --> special character
 */

public class LetterOrDigitOrSpecialChar {
    public static void main(String[] args) {

        char ch = '0';
        boolean isDigit = ch >=48 && ch <=57;
        boolean isLetter = (ch >=65 && ch<=90) || (ch >=97 && ch <= 122);
        String result = "";


        if(isDigit){
            result = " is a Digit";
        }else if(isLetter){
                result = " is a Letter";
            }else {
            result = " This is a special digit";
            }
        System.out.println(ch+result);




    }

}
