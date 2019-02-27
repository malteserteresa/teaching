import java.util.Arrays;

public class Pizza extends Food {

	private String[] toppings;

	public Pizza(String reqName, String[] reqToppings, double reqPrice) {
		super(reqName, reqPrice);
		toppings = reqToppings;
	}

	public String[] getToppings() {
		return toppings;
	}

	@Override
	public String toString() {
		return " The name of the pizza is " + super.getName() + " the toppings on it are " + Arrays.toString(toppings)
				+ " and the price of it is " + super.getPrice();
	}

}
