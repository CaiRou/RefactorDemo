package rentalstore.statement;

import rentalstore.Customer;
import rentalstore.Rental;

/**
 * @Author C.
 * @Date 2018-08-25 21:10
 */
public class TextStatement extends Statement{

    public String getHeadString(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }

    public String getEachRentalString(Rental rental) {
        return "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "\n";
    }

    public String getFooterString(Customer customer) {
        return "Amount owed is " + String.valueOf(customer.getTotalCharge()) + "\n"
               + "You earned " + String.valueOf(customer.getTotalFrequentRentalPoints()) + " frequent renter points";

    }
}
