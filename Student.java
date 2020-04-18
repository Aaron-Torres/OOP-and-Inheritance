

public class Student extends Person {
	
	 String status;
	
	public Student () {
		
	}//default constructor
	
	public Student(String name, String address, String phoneNumber, String email, String status) {
		super.name = name;
		super.address = address;
		super.phoneNumber = phoneNumber;
		super.email = email;
		this.status = status;
	}//end student with parameters

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}//end main method
	
	
	@Override
	public String toString() {
		String s = "Student: " + name + "\nAddress: " + address + "\nPhone Number: " + phoneNumber + "\nEmail: " + email + "\nClass Status: " + status;
		
		return s;
	}//end toString method
}