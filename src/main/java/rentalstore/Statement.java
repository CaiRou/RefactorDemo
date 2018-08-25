package rentalstore;

import java.util.Enumeration;

/**
 * @Author C.
 * @Date 2018-08-25 21:09
 */
public abstract class Statement {
    String value(Customer customer){
        Enumeration rentals = customer.getRentals().elements();
        String result = this.getHeadString(customer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += getEachRentalString(each);
        }
        result += getFooterString(customer);
        return result;
    }

    abstract String getHeadString(Customer customer);

    abstract String getEachRentalString(Rental rental);

    abstract String getFooterString(Customer customer);
}
