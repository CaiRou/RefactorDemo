package rentalstore;

import java.util.Enumeration;

/**
 * @Author C.
 * @Date 2018-08-25 21:11
 */
public class HtmlStatement extends Statement{


    public String getHeadString(Customer customer){
        return "<H1>Rentals for <EM>" + customer.getName() + "</EM></H1><P>\n";
    }


    public String getEachRentalString(Rental rental){
        return rental.getMovie().getTitle() + ": " + String.valueOf(rental.getCharge()) + "<BR>\n";
    }

    public String getFooterString(Customer customer){
        return "<P>You owe<EM>" + String.valueOf(customer.getTotalCharge()) + "</EM><P>\n"
                + "On this rental you earned <EM>" + String.valueOf(customer.getTotalFrequentRentalPoints())
                + "</EM> frequent renter points<P>";
    }
}
