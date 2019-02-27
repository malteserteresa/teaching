import java.util.Arrays;

public class Burger extends Food {

	private String[] fillings;

	public Burger(String reqName, String[] reqFillings, double reqPrice) {
		super(reqName, reqPrice);
		fillings = reqFillings;
	}

	public String[] getFillings() {
		return fillings;
	}

	@Override
	public String toString() {
		return "Burger [name=" + super.getName() + ", fillings=" + Arrays.toString(fillings) + ", price="
				+ super.getName() + "]";
	}

}
