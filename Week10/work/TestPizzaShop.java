import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestPizzaShop {

	PizzaShop pizzaShop = new PizzaShop();
	Customer[] customers = pizzaShop.getCustomers();
	Pizza[] pizzas = pizzaShop.getPizzas();
	Customer[] icustomers = pizzaShop.getCustomers();

	@Test
	public void testCustomers() {
		assertTrue("Joe Bloggs".equals(customers[0].getName()));
	}

	@Test
	public void testPizza() {
		assertTrue("margherita".equals(pizzas[0].getName()));
	}

	@Test
	public void testOrder() {
		int beforeAddOrder = pizzaShop.orderNumber;
		pizzaShop.addOrder(customers[0], pizzas);
		int afterAddOrder = pizzaShop.orderNumber;
		assertFalse(beforeAddOrder == afterAddOrder);
	}

	@Test
	public void toCustomer() {
		System.out.println(icustomers[3].toString());
	}
}
