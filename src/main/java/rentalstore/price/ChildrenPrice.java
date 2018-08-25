package rentalstore.price;

import rentalstore.Movie;

/**
 * @Author C.
 * @Date 2018-08-25 22:44
 */
public class ChildrenPrice implements Price {
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }

    public double getCharge(int daysRented) {
        double thisAmount = 1.5;
        if(daysRented > 3){
            thisAmount += (daysRented -3) * 1.5;
        }
        return thisAmount;
    }
}
