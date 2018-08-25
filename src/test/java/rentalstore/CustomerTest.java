package rentalstore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * @Author C.
 * @Date 2018-08-25 20:09
 */


public class CustomerTest {
    private Customer customer = new Customer("Kevin");

    @Test
    public void should_return_correct_statement_given_customer_has_no_rental() {
        String statement = customer.statement();
        assertEquals("Rental Record for Kevin\nAmount owed is 0.0\nYou earned 0 frequent renter points", statement);
    }



}
