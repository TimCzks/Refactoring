package packageTests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import packageClasses.Customer;
import packageClasses.Movie;
import packageClasses.Rental;

public class CustomerTest {

	@Test
	public void testAmountFor() {
		Customer cstmr = new Customer("Dummy");
		Rental aRental = new Rental(new Movie("title", Movie.REGULAR), 1);
		assertEquals(2, cstmr.amountFor(aRental), 0.001);
	}

}
