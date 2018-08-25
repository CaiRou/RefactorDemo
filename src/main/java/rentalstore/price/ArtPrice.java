package rentalstore.price;

import rentalstore.Movie;

/**
 * @Author C.
 * @Date 2018-08-25 23:07
 */
public class ArtPrice implements Price {
    public int getPriceCode() {
        return Movie.ART;
    }

    public double getCharge(int daysRented) {
        return daysRented * 6;
    }
}
