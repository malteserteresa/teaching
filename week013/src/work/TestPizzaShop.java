package work;

public class TestPizzaShop {
	public static void main(String[] args) {
		// Part 3a
		PizzaShop pizzaShop = new PizzaShop();

		// Part 3b
		Customer[] customers = pizzaShop.getCustomers();
		Pizza[] allPizzas = pizzaShop.getPizzas();

		// create a new order
		for (int i = 0; i < 7; i++) {
			Customer orderingCustomer = customers[1];
			Pizza[] orderedPizzas = new Pizza[3];
			orderedPizzas[0] = allPizzas[1];
			orderedPizzas[1] = allPizzas[1];
			orderedPizzas[2] = allPizzas[1];
			pizzaShop.addOrder(orderingCustomer, orderedPizzas);

			Customer orderingCustomer2 = customers[0];
			Pizza[] orderedPizzas2 = new Pizza[3];
			orderedPizzas2[0] = allPizzas[1];
			orderedPizzas2[1] = allPizzas[2];
			orderedPizzas2[2] = allPizzas[2];
			pizzaShop.addOrder(orderingCustomer2, orderedPizzas2);

			Customer orderingCustomer3 = customers[2];
			Pizza[] orderedPizzas3 = new Pizza[2];
			orderedPizzas3[0] = allPizzas[2];
			orderedPizzas3[1] = allPizzas[1];
			pizzaShop.addOrder(orderingCustomer3, orderedPizzas3);

			Customer orderingCustomer4 = customers[3];
			Pizza[] orderedPizzas4 = new Pizza[2];
			orderedPizzas3[0] = allPizzas[2];
			orderedPizzas3[2] = allPizzas[1];
			pizzaShop.addOrder(orderingCustomer4, orderedPizzas4);

			Customer orderingCustomer5 = customers[1];
			Pizza[] orderedPizzas5 = new Pizza[1];
			orderedPizzas3[1] = allPizzas[1];
			pizzaShop.addOrder(orderingCustomer4, orderedPizzas4);

		}

		System.out.println(pizzaShop.getStatus());

	}
}
