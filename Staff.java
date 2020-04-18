

public class Staff extends Employee {
	
	protected String title;
	
	public Staff(String name, String address, String phoneNumber, String email, String office, double salary,int year, int month, int dayOfEmployment, String title) {
		super.name = name;
		super.address = address;
		super.phoneNumber = phoneNumber;
		super.email = email;
		
		super.office = office;
		super.salary = salary;
		super.year = year;
		super.month = month;
		super.dayOfEmployment = dayOfEmployment;
		
		this.title = title;
		
		
	}//end constructor with parameters
	
	public Staff() {
		
	}//default Constructor;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}//end main method
	
	/**************************Set and Get Methods****************************/
	public String getTitle() {
		return title;
	}//end getTitle
	
	public void setTitle(String title) {
		this.title = title;
	}//end setTitle
	
	
	@Override
	public String toString() {
		String s = "Staff: " + name + "\nAddress: " + address + "\nPhone Number: " + phoneNumber + "\nEmail: " + email + "\nOffice: " + office + "\nSalary: " + salary + "\nDate of employment: Year: " + year + "| Month: " + month + "| Day:" + dayOfEmployment + "\nTitle: " + title;
		
		return s;
	}//end toString method
}//end class
