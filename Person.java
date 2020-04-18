
public class Person {
	
	String name, address, phoneNumber, email;
	
	public Person() {
		
	}//default constructor
	
	public Person(String name, String address, String phoneNumber, String email) {
		
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		
	}//constructor with parameters

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}//end main method
	
	/**************************Set and Get Methods****************************/
	public String getName() {
		return name;
	}//end getName
	
	public String getAddress() {
		return address;
	}//end getAddress
	
	public String getPhoneNumber () {
		return phoneNumber;
	}//end getPhoneNumber
	
	public String getEmail() {
		return email;
	}//end getEmail
	
	public void setName(String name) {
		this.name = name;
	}//end setName
	
	public void setAddress(String address) {
		this.address = address;
	}//end address
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}//end setPhoneNumber
	
	public void setEmail(String email) {
		this.email = email;
	}//end setEmail
	
	@Override
	public String toString() {
		String s = "Person:" +  name + "\nAddress: " + address + "\nPhone Number: " + phoneNumber + "\nEmail: " + email;
		
		return s;
	}//end toString method
}//end Person

