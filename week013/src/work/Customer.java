package work;

public class Customer {

	// the customer's name
	private String name;

	// the customer's address (for delivery)
	private String address;

	// the main constructor for a Customer - must supply a name and an address
	public Customer(String reqName, String reqAddress) {
		name = reqName;
		address = reqAddress;
	}

	// get the customer's name
	public String getName() {
		return name;
	}

	// get the customer's address
	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + "]";
	}

}
