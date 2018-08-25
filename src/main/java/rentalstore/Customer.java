package rentalstore;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    private Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg){
        rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    public String statement(){
        return new TextStatement().value(this);
    }


    /**
     * 计算总金额
     * @return
     */
     double getTotalCharge(){
        double totalAmount = 0;
        Enumeration rentals = this.rentals.elements();
        while(rentals.hasMoreElements()){
            Rental rental = (Rental) rentals.nextElement();
            totalAmount += rental.getCharge();
        }
        return totalAmount;
    }

    /**
     * 计算总积分
     * @return
     */
     int getTotalFrequentRentalPoints(){
        int totalFrequentRentalPoints = 0;
        Enumeration rentals = this.rentals.elements();
        while(rentals.hasMoreElements()){
            Rental rental = (Rental) rentals.nextElement();
            totalFrequentRentalPoints += rental.getFrequentRentalPoints();
        }
        return totalFrequentRentalPoints;
    }


    public String htmlStatement() {
        return new HtmlStatement().value(this);
    }

    public Vector getRentals() {
        return rentals;
    }
}
