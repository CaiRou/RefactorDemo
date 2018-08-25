package rentalstore.point;

import rentalstore.point.Point;

/**
 * @Author C.
 * @Date 2018-08-25 23:54
 */
public class DefaultPoint implements Point {
    public double getFrequentRentalPoints(int dayRented) {
        return 1;
    }
}
