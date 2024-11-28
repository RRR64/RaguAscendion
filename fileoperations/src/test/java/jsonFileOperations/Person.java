package jsonFileOperations;

import java.util.List;

public class Person {
	
	String firstName;
	
	List<Address> address;
	
	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	String lastName;
	
	
	  public String toString() { return firstName + lastName + address;
	  
	  }
	 
}