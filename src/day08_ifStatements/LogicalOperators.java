package day08_ifStatements;

public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println( !true); //false
        System.out.println(!false); //true
        System.out.println(true == !false); //true = true
        System.out.println( true != !true); //true
        System.out.println("---------------------------");
        int score = 80;
        boolean pass = score >= 60;
        //boolean fail = score <60;
        boolean failed = !pass;
        System.out.println("pass = " + pass);
        System.out.println("failed = " + failed);
        System.out.println("---------------------------");
        int age = 21;
        boolean eligible = age>=21;
        boolean notEligible = !eligible;
        System.out.println("eligible = " + eligible);
        System.out.println("notEligible = " + notEligible);
        System.out.println("---------------------------");
        int ApplesCount = 20;
        int OrangesCount=30;
        int PearsCount=30;
        boolean comp = ApplesCount <OrangesCount || OrangesCount >=PearsCount;
        System.out.println("comp = " + comp);

        String OutsideWeather;
        int Degree;
        //continue later.


    }



}
