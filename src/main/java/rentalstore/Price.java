package rentalstore;

/**
 * @Author C.
 * @Date 2018-08-25 22:40
 */
public interface Price {
    int getPriceCode();
    double getCharge(int daysRented);
}
