package rentalstore;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String htmlStatement() {
        return new HtmlStatement().statement(this);
    }

    public String statement() {
        return new TextStatement().statement(this);
    }

    double getTotalAmount(){
        return rentals.stream().mapToDouble(Rental::getThisAmount).sum();
    }

    int getTotalFrequentRenterPoints(){
        int frequentRenterPoints = 0;
        for(Rental each : this.rentals){
            frequentRenterPoints += each.getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }

    public List<Rental> getRentals() {
        return rentals;
    }
}
