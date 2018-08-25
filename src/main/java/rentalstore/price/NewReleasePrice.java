package rentalstore.price;

import rentalstore.Movie;
import rentalstore.price.Price;

/**
 * @Author C.
 * @Date 2018-08-25 22:42
 */
public class NewReleasePrice implements Price {
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    public double getCharge(int daysRented) {
        return daysRented * 3;
    }
}
