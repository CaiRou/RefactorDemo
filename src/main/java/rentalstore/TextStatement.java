package rentalstore;

import java.util.Enumeration;

/**
 * @Author C.
 * @Date 2018-08-25 21:10
 */
public class TextStatement extends Statement{

    String getHeadString(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }

    String getEachRentalString(Rental rental) {
        return "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "\n";
    }

    String getFooterString(Customer customer) {
        return "Amount owed is " + String.valueOf(customer.getTotalCharge()) + "\n"
               + "You earned " + String.valueOf(customer.getTotalFrequentRentalPoints()) + " frequent renter points";

    }
}
