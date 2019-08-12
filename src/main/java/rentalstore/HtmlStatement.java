package rentalstore;

public class HtmlStatement extends Statement{

    protected String figuresStr(Rental each, double thisAmount) {
        return each.getMovie().getTitle() + ": " + thisAmount + "<BR>\n";
    }

    protected String footerStr(double totalAmount, int frequentRenterPoints) {
        String footer = "<P>You owe<EM>"+ totalAmount+"</EM><P>\n";
        footer += "On this rental you earned <EM>"+frequentRenterPoints+"</EM> frequent renter points<P>";
        return footer;
    }

    protected String headStr(String name) {
        return "<H1>Rentals for <EM>" + name + "</EM></H1><P>\n";
    }


}
