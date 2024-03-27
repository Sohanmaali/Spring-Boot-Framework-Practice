package springCore.autoWired;

public class Address {

	private String street;
	private String pincode;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getPincode() {
		return pincode;
	}
	
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public Address(String street, String pincode) {
		super();
		this.street = street;
		this.pincode = pincode;
	}

	public Address() {
		super();
		
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", pincode=" + pincode + "]";
	}
	
	
	
}
