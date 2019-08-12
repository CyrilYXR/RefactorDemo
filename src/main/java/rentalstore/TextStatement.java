package rentalstore;

public class TextStatement extends Statement {

    protected String figuresStr(Rental each, double thisAmount) {
        return "\t" + each.getMovie().getTitle() + "\t" + thisAmount + "\n";
    }

    protected String footerStr(double totalAmount, int frequentRenterPoints) {
        String footer = "Amount owed is " + totalAmount + "\n";
        footer += "You earned " + frequentRenterPoints + " frequent renter points";
        return footer;
    }

    protected String headStr(String name) {
        return "Rental Record for " + name + "\n";
    }
}
