package springCore.autoWired.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address = " + address + "]";
	}

	@Autowired

	public Student(@Qualifier("address1") Address address) {
		super();
		this.address = address;
	}

	public Student() {
		super();
	}

}
