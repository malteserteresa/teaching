import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestPizza {

	Pizza pizza1 = new Pizza("Chicken", new String[] { "Chicken", "sweetcorn" }, 5.00);

	@Test
	public void testGetPizzaName() {
		String name = pizza1.getName();
		assertTrue("Chicken".equals(name));
	}

	@Test
	public void testPizzaPrice() {
		double price = pizza1.getPrice();
		assertTrue(5.00 == price);

	}

	@Test
	public void testPizzaToppings() {
		String[] toppings = pizza1.getToppings();
		assertTrue("Chicken", "Sweetcorn".equals(toppings));
	}
}
