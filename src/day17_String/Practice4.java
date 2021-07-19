package day17_String;

import java.util.Scanner;

/*
4. Ask the user to enter username and password, and username can be typed either in lowercase or uppercase.
    Still, the password must be exact in order to log in.
    write a program to check if the user entered username & passwords match with the saved username & password in the database.
    If it's, then print "Logged in successfully". Otherwise, print "Invalid username or password."
        Assume that your username & password in the database are:
                                Cybertek@gmail.com
                                Cybertek123
        Ex:
            username: CYBERTEK@Gmail.com
            password: Cybertek123
            output:
                Logged in successfully
 */
public class Practice4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userName = scan.next();
        String password = scan.next();
        scan.close();
        if(userName.equalsIgnoreCase("cybertek@gmail.com") && password.equals("Cybertek123")){
            System.out.println("Logged in Successfully");
        }else{
            System.out.println("Invalid username or password");
        }






    }
}
