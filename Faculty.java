

public class Faculty extends Employee {
	
	protected String officeHours;
	protected String rank;
	
	public Faculty(String name, String address, String phoneNumber, String email, String office, double salary,int year, int month, int dayOfEmployment, String officeHours, String rank) {
		super.name = name;
		super.address = address;
		super.phoneNumber = phoneNumber;
		super.email = email;
		
		super.office = office;
		super.salary = salary;
		super.year = year;
		super.month = month;
		super.dayOfEmployment = dayOfEmployment;
		
		this.officeHours = officeHours;
		this.rank = rank;
	}//end constructor with parameters
	
	public Faculty() {
		
	}//default constructor
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}//end main method
	
	/**************************Set and Get Methods****************************/
	public String getOfficeHours() {
		return officeHours;
	}//end getOfficeHours
	
	public String getRank() {
		return rank;
	}//end getrank
	
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}//end setOfficeHours
	
	public void setRank(String rank) {
		this.rank = rank;
	}//end setrank
	
	@Override
	public String toString() {
		String s = "Faculty: " + name + "\nAddress: " + address + "\nPhone Number: " + phoneNumber + "\nEmail: " + email + "\nOffice: " + office + "\nSalary: " + salary + "\nDate of employment: Year: " + year + "| Month: " + month + "| Day:" + dayOfEmployment + "\nOffice hours: " + officeHours + "\nRank: " + rank ;
		
		return s;
	}//end toString method

}//end class

