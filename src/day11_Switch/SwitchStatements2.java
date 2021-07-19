package day11_Switch;

public class SwitchStatements2 {
    public static void main(String[] args) {

        String name = "chrome";

        switch (name){
            case "chrome":
                System.out.println("Chrome Browser is selected");
                break;
            case "firefox":
                System.out.println("Firefox Browser is selected");
                break;
            case "edge":
                System.out.println("Edge Browser is selected");
                break;
            default:
                System.err.println("Invalid Browser is selected");
                break;


        }






    }
}
