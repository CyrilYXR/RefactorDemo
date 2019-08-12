package rentalstore;

public class NewReleaseMovie extends Movie {
    public NewReleaseMovie(String title) {
        super(title);
    }

    @Override
    public double getAmount(int dayRented) {
        return dayRented * 3;
    }
}
