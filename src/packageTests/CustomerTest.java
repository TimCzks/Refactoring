package packageTests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import packageClasses.Customer;
import packageClasses.Movie;
import packageClasses.Rental;

class CustomerTest {

	Customer classUnderTest = new Customer("Dummy");

	@Test
	void testStatement() {
		String expectedResult = "Rental Record for Dummy\n\tTitle\t\tDays\tAmount\n" + "\t" + "title\t\t1\t2.0\n"
				+ "Amount owed is " + 2.0 + "\n" + "You earned " + 0 + " frequent renter points";
		classUnderTest.addRental(new Rental(new Movie("title", Movie.REGULAR), 1));
		assertEquals(expectedResult, classUnderTest.statement());
	}

}
