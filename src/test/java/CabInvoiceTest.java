import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * In this we have written the test cases for our program We are using the TDD
 * approach here.
 * 
 * @Before annotation are run before each test. This is useful when we want to
 *         execute some common code before running a test.
 * @author Moinuddin
 *
 */
public class CabInvoiceTest {
	InvoiceGenerator invoice = new InvoiceGenerator();

	
	/**
	 * Check fare as: 4*10+4 = 44
	 */
	@Test
	public void testGenerateInvoice() {

		Assert.assertEquals(44, invoice.generateInvoice(new Rides(4, 4)), 0.0);
	}

	/**
	 * Fare = 0.2*10+1 = 3 which is less than 5.
	 * Should give fare = 5
	 */
	@Test
	public void testGenerateInvoice_getMin() {

		Assert.assertEquals(5, invoice.generateInvoice(new Rides(0.2, 1)), 0.0);
	}
}