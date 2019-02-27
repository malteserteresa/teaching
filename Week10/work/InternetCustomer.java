
public class InternetCustomer extends Customer {

	private String emailAddress;

	public InternetCustomer(String reqName, String reqAddress, String emailAddress) {
		super(reqName, reqAddress);
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "InternetCustomer [emailAddress=" + emailAddress + ", name =" + getName() + ",address=" + getAddress()
				+ "]";
	}

}
