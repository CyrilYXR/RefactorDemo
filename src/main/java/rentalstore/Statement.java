package rentalstore;

public abstract class Statement {

    public String statement(Customer customer) {
        StringBuilder result = new StringBuilder(headStr(customer.getName()));
        for (Rental each : customer.getRentals()) {
            String figures = figuresStr(each, each.getThisAmount());
            result.append(figures);
        }

        result.append(footerStr(customer.getTotalAmount(), customer.getTotalFrequentRenterPoints()));
        return result.toString();
    }

    protected abstract String footerStr(double totalAmount, int totalFrequentRenterPoints);

    protected abstract String figuresStr(Rental each, double thisAmount);

    protected abstract String headStr(String name);

}
