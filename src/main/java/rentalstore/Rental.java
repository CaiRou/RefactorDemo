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
        double thisAmount = 0;
        switch (this.getMovie().getPriceCode()){
            case Movie.REGULAR:
                thisAmount += 2;
                if(this.getDayRented() > 2){
                    thisAmount += (this.getDayRented() - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                thisAmount += this.getDayRented()*3;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if(this.getDayRented() > 3){
                    thisAmount += (this.getDayRented() -3) * 1.5;
                }
                break;
        }
        return thisAmount;
    }

    /**
     * 积分计算规则
     * @return
     */
    public int getFrequentRentalPoints(){
        if((this.getMovie().getPriceCode() == Movie.NEW_RELEASE) && this.getDayRented() > 1){
            return 2;
        }
        return 1;
    }
}
