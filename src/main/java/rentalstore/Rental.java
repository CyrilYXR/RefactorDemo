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

    double getThisAmount() {
        return getMovie().getAmount(dayRented);
    }

    int getFrequentRenterPoints() {
        if (movie.getClass() == NewReleaseMovie.class && getDayRented() > 1) {
            return 2;
        }
        return 1;
    }
}
