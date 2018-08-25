package rentalstore;

/**
 * @Author C.
 * @Date 2018-08-25 23:44
 */
public class NewReleasePoint implements Point {

    public double getFrequentRentalPoints(int dayRented) {
        if(dayRented > 1){
            return 2;
        }
        return 1;
    }
}
