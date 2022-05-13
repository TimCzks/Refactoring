package packageTests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import packageClasses.Movie;
import packageClasses.Rental;

public class RentalTest {

	@Test
	public void testGetCharge() {
		Rental aRental = new Rental(new Movie("title", Movie.REGULAR), 1);
		assertEquals(2, aRental.getCharge(), 0.001);
	}

}
