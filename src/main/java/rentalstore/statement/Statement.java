package rentalstore.statement;

import rentalstore.Customer;
import rentalstore.Rental;

import java.util.Enumeration;

/**
 * @Author C.
 * @Date 2018-08-25 21:09
 */
public abstract class Statement {
    public String value(Customer customer){
        Enumeration rentals = customer.getRentals().elements();
        String result = this.getHeadString(customer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += getEachRentalString(each);
        }
        result += getFooterString(customer);
        return result;
    }

    public abstract String getHeadString(Customer customer);

    public abstract String getEachRentalString(Rental rental);

    public abstract String getFooterString(Customer customer);
}
