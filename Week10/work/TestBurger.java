import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestBurger {

	Burger burger1 = new Burger("Beef Burger", new String[] { "Beef" }, 5.00);

	@Test
	public void testName() {
		String name = burger1.getName();
		assertTrue("Beef Burger".equals(name));
	}

	@Test
	public void testFillings() {
		String[] fillings = burger1.getFillings();
		assertTrue("Beef".equals(fillings));

	}

	@Test
	public void testPrice() {
		double price = burger1.getPrice();
		assertTrue(5.00 == price);

	}

}
