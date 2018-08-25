package rentalstore;

public class Rental {
    private Movie movie;
    private int dayRented;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDayRented() {
        return dayRented;
    }


    /**
     * 租赁计费
     * @return
     */
    public double getCharge(){
        return this.getMovie().getCharge(dayRented);
    }

    /**
     * 积分计算规则
     * @return
     */
    public double getFrequentRentalPoints(){
        if((this.getMovie().getPriceCode() == Movie.NEW_RELEASE) && this.getDayRented() > 1){
            return 2;
        }
        if((this.getMovie().getPriceCode() == Movie.ART)){
            return 1.5;
        }
        return 1;
    }
}
