package work;

public class Order {
	// the customer placing the order
	private Customer customer;

	// the pizzas that have been ordered
	private Pizza[] pizzas;

	// the total price for all the pizzas
	private double totalPrice;

	// the main constructor for an order. Only requires customer and a list of
	// pizzas as total price will be calculated
	public Order(Customer reqCustomer, Pizza[] reqPizzas) {
		customer = reqCustomer;
		pizzas = reqPizzas;

		// calculate total price based on price of each pizza
		totalPrice = 0.0;
		for (Pizza pizza : pizzas)

			totalPrice += pizza.getPrice();
	}

	public String displayOrder() {
		return this.toString();
	}

	// get the object referring to the customer
	public Customer getCustomer() {
		return customer;
	}

	// get the pizzas that have been ordered
	public Pizza[] getPizzas() {
		return pizzas;
	}

	// get the total price of this order
	public double getTotalPrice() {
		return totalPrice;
	}
}
