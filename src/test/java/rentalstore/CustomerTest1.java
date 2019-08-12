//package rentalstore;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//public class CustomerTest1 {
//
//    @Test
//    public void should_return_correct_rental_record_when_customer_has_no_rentals(){
//        //given
//        Customer customer = new Customer("Cyril");
//
//        //when
//        String statement = customer.statement();
//
//        //then
//        Assert.assertEquals("Rental Record for Cyril\n" +
//                "Amount owed is 0.0\n" +
//                "You earned 0 frequent renter points", statement);
//    }
//
//    @Test
//    public void should_return_correct_rental_record_when_customer_rental_a_CHILDRENS_movie_for_2_day(){
//        //given
//        Customer customer = new Customer("Cyril");
//        Rental rental1 = new Rental(new Movie("AAAA", Movie.CHILDRENS), 2);
//        customer.addRental(rental1);
//
//        //when
//        String statement = customer.statement();
//
//        //then
//        Assert.assertEquals("Rental Record for Cyril\n" +
//                "\tAAAA\t1.5\n" +
//                "Amount owed is 1.5\n" +
//                "You earned 1 frequent renter points", statement);
//    }
//
//    @Test
//    public void should_return_correct_rental_record_when_customer_rental_a_CHILDRENS_movie_for_4_day(){
//        //given
//        Customer customer = new Customer("Cyril");
//        Rental rental1 = new Rental(new Movie("A ChildrenMovie movie", Movie.CHILDRENS), 4);
//        customer.addRental(rental1);
//
//        //when
//        String statement = customer.statement();
//
//        //then
//        Assert.assertEquals("Rental Record for Cyril\n" +
//                "\tA ChildrenMovie movie\t3.0\n" +
//                "Amount owed is 3.0\n" +
//                "You earned 1 frequent renter points", statement);
//    }
//
//    @Test
//    public void should_return_correct_rental_record_when_customer_rental_a_REGULAR_movie_for_1_day(){
//        //given
//        Customer customer = new Customer("Cyril");
//        Rental rental = new Rental(new Movie("A Regular movie", Movie.REGULAR), 1);
//        customer.addRental(rental);
//
//        //when
//        String statement = customer.statement();
//
//        //then
//        Assert.assertEquals("Rental Record for Cyril\n" +
//                "\tA Regular movie\t2.0\n" +
//                "Amount owed is 2.0\n" +
//                "You earned 1 frequent renter points", statement);
//    }
//
//    @Test
//    public void should_return_correct_rental_record_when_customer_rental_a_REGULAR_movie_for_3_day(){
//        //given
//        Customer customer = new Customer("Cyril");
//        Rental rental = new Rental(new Movie("A Regular movie", Movie.REGULAR), 3);
//        customer.addRental(rental);
//
//        //when
//        String statement = customer.statement();
//
//        //then
//        Assert.assertEquals("Rental Record for Cyril\n" +
//                "\tA Regular movie\t3.5\n" +
//                "Amount owed is 3.5\n" +
//                "You earned 1 frequent renter points", statement);
//    }
//
//    @Test
//    public void should_return_correct_rental_record_when_customer_rental_a_NEW_RELEASE_movie_for_1_day(){
//        //given
//        Customer customer = new Customer("Cyril");
//        Rental rental = new Rental(new Movie("A New Release movie", Movie.NEW_RELEASE), 1);
//        customer.addRental(rental);
//
//        //when
//        String statement = customer.statement();
//
//        //then
//        Assert.assertEquals("Rental Record for Cyril\n" +
//                "\tA New Release movie\t3.0\n" +
//                "Amount owed is 3.0\n" +
//                "You earned 1 frequent renter points", statement);
//    }
//
//    @Test
//    public void should_return_correct_rental_record_when_customer_rental_two_NEW_RELEASE_movies_for_1_day(){
//        //given
//        Customer customer = new Customer("Cyril");
//        Rental rental1 = new Rental(new Movie("A New Release movie1", Movie.NEW_RELEASE), 1);
//        Rental rental2 = new Rental(new Movie("A New Release movie2", Movie.NEW_RELEASE), 1);
//        customer.addRental(rental1);
//        customer.addRental(rental2);
//
//        //when
//        String statement = customer.statement();
//
//        //then
//        Assert.assertEquals("Rental Record for Cyril\n" +
//                "\tA New Release movie1\t3.0\n" +
//                "\tA New Release movie2\t3.0\n" +
//                "Amount owed is 6.0\n" +
//                "You earned 2 frequent renter points", statement);
//    }
//
//    @Test
//    public void should_return_correct_rental_record_when_customer_rental_two_NEW_RELEASE_movies_for_2_day(){
//        //given
//        Customer customer = new Customer("Cyril");
//        Rental rental1 = new Rental(new Movie("A New Release movie1", Movie.NEW_RELEASE), 2);
//        Rental rental2 = new Rental(new Movie("A New Release movie2", Movie.NEW_RELEASE), 2);
//        customer.addRental(rental1);
//        customer.addRental(rental2);
//
//        //when
//        String statement = customer.statement();
//
//        //then
//        Assert.assertEquals("Rental Record for Cyril\n" +
//                "\tA New Release movie1\t6.0\n" +
//                "\tA New Release movie2\t6.0\n" +
//                "Amount owed is 12.0\n" +
//                "You earned 4 frequent renter points", statement);
//    }
//
//    @Test
//    public void should_return_correct_rental_record_when_customer_rental_two_NEW_RELEASE_movies_for_1_and_2_day(){
//        //given
//        Customer customer = new Customer("Cyril");
//        Rental rental1 = new Rental(new Movie("A New Release movie1", Movie.NEW_RELEASE), 2);
//        Rental rental2 = new Rental(new Movie("A New Release movie2", Movie.NEW_RELEASE), 1);
//        customer.addRental(rental1);
//        customer.addRental(rental2);
//
//        //when
//        String statement = customer.statement();
//
//        //then
//        Assert.assertEquals("Rental Record for Cyril\n" +
//                "\tA New Release movie1\t6.0\n" +
//                "\tA New Release movie2\t3.0\n" +
//                "Amount owed is 9.0\n" +
//                "You earned 3 frequent renter points", statement);
//    }
//
//    @Test
//    public void should_return_correct_rental_record_when_customer_rental_a_NEW_RELEASE_movies_for_1_and_2_day(){
//        //given
//        Customer customer = new Customer("Cyril");
//        Rental rental1 = new Rental(new Movie("A New Release movie1", Movie.NEW_RELEASE), 2);
//        Rental rental2 = new Rental(new Movie("A New Release movie2", Movie.NEW_RELEASE), 1);
//        customer.addRental(rental1);
//        customer.addRental(rental2);
//
//        //when
//        String statement = customer.statement();
//
//        //then
//        Assert.assertEquals("Rental Record for Cyril\n" +
//                "\tA New Release movie1\t6.0\n" +
//                "\tA New Release movie2\t3.0\n" +
//                "Amount owed is 9.0\n" +
//                "You earned 3 frequent renter points", statement);
//    }
//
//}
