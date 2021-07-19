package day07_ShortHand_Relational;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Aaron King";
        int age = 34;
        String countryCitizenship = "United States";
        int creditScore = 730;


        boolean eligibleToVote = age >= 18 && countryCitizenship == "United States" && creditScore >= 700;
        //                        34 >= 18      &&    "UK" == "United States"
        //                              true    &&      false
        System.out.println(name+ " is eligible to vote for Biden: "+eligibleToVote);
    }
}
