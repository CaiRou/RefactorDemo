package rentalstore;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.setPriceCode(priceCode);
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }


    public String getTitle() {
        return title;
    }


    public void setPriceCode(int priceCode){
        switch (priceCode){
            case REGULAR:
                price = new RegularPrice();
                break;
            case Movie.NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            case Movie.CHILDRENS:
                price = new ChildrenPrice();
                break;
        }
    }

    public double getCharge(int daysRented){
        return price.getCharge(daysRented);
    }
}
