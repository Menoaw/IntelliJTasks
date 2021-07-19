package Replit.Rep_03_String;

import java.util.Scanner;
/*
Swap first name with last name in the email (Seperated by an underscore).
    If the email doesn't contain an underscore print the given input email.

Examples:

input: mike_tyson@gmail.com

output: tyson_mike@gmail.com
input: mike_tyson@gmail.com

output: tyson_mike@gmail.com
input: barakobama@gmail.com

output: barakobama@gmail.com
 */
public class Email1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
/*
        if(email.contains("_")){
           String firstName = email.substring(0,(email.indexOf("_")));
           String lastName = email.substring(email.indexOf("_")+1,(email.indexOf('@')));
            System.out.println(lastName+"_"+firstName+email.indexOf("@"));

        }else{
            System.out.println(email);
        }
*/

        int indexOf_ = email.indexOf("_");
        int indexOfAt = email.indexOf("@");
        if(email.contains("_")){
        String firstName = email.substring(0,indexOf_);
        String lastName = email.substring(indexOf_+1,indexOfAt);
        String remaining = email.substring(indexOfAt);
            System.out.println(lastName+"_"+firstName+remaining);
        }else{
            System.out.println(email);
        }

    }
}
