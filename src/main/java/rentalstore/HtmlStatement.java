package rentalstore;

import java.util.Enumeration;

/**
 * @Author C.
 * @Date 2018-08-25 21:11
 */
public class HtmlStatement implements Statement{
    public String value(Customer customer) {
        Enumeration rentals = customer.getRentals().elements();
        String result = "<H1>Rentals for <EM>" + customer.getName() + "</EM></H1><P>\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";
        }
        //add footer lines
        result += "<P>You owe<EM>" + String.valueOf(customer.getTotalCharge()) + "</EM><P>\n";
        result += "On this rental you earned <EM>" + String.valueOf(customer.getTotalFrequentRentalPoints()) +
                "</EM> frequent renter points<P>";
        return result;
    }
}
