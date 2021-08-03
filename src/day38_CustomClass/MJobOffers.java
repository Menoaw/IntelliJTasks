package day38_CustomClass;

import day38_CustomClass.offerTask.Offer;
import java.util.ArrayList;
import java.util.Arrays;

public class MJobOffers {

    public static void main(String[] args) {
        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();

        offer1.setInfo("CA", "Los Angles", "SDET", 120000, true, false, false, false);
        offer2.setInfo("TX", "Austin", "Software Developer", 130000, true, true, true, false);
        offer3.setInfo("VA", "McLean", "QA", 110000, true, true, true, true);
        offer4.setInfo("NV", "Las Vegas", "Scrum Master", 1250000, false, false, true, false);
        offer5.setInfo("NC", "Charlotte", "SDET", 1200000, false, true, true, false);
        offer6.setInfo("WA", "Seattle", "BA", 1350000, true, false, true, true);
        offer7.setInfo("CO", "Denver", "QE", 85000, true, true, true, true);

        Offer[] arr ={offer1, offer2, offer3, offer4, offer5, offer6, offer7};

        System.out.println("-------------------------------------------------");
        // add the CA & NV offers
        ArrayList<Offer> localOffers = new ArrayList<>( Arrays.asList(arr) );
        localOffers.removeIf( offer ->  ! (offer.state.equals("CA") || offer.state.equals("NV")) );
        System.out.println(localOffers.size());

        System.out.println(localOffers);

        System.out.println("-----------------------------------------------------");
        //only keep the offers that are full-time
        ArrayList<Offer> fullTimeOffers = new ArrayList<>( Arrays.asList(arr) );
        fullTimeOffers.removeIf( offer -> !offer.isFullTime   );
        System.out.println(fullTimeOffers.size());
        System.out.println(fullTimeOffers);

        System.out.println("---------------------------------------------------------");
        // only keep the offers that are WFH & hasPTO
        ArrayList<Offer> WFHOffers = new ArrayList<>( );

        for (Offer offer : arr) {
            if(offer.isWFH && offer.hasPTO){
                WFHOffers.add(offer);
            }
        }

        System.out.println(WFHOffers.size());
        System.out.println(WFHOffers);

        System.out.println("----------------------------------------------------------");

        //only keep the offers that has the salary of 125k or more
        ArrayList<Offer> highSalaryOffers = new ArrayList<>( Arrays.asList(arr));
        highSalaryOffers.removeIf( offer -> offer.salary < 125000 );

        System.out.println(highSalaryOffers.size());
        System.out.println(highSalaryOffers);



    }

}

/*
            2. write a program that can only keep the offers from your local area
	        3. write program that can remove all the offers that are not SDET or QA
	        4. write a program that can remove all the offers that are not WFH
	        5. write a program that can remove all the offers that do not have benifits
 */