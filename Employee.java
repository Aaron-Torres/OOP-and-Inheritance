

public class Employee extends Person {
	
	protected String office;
	protected double salary;
	protected int year;
	protected int month;
	protected int dayOfEmployment;
	
	public Employee(String name, String address, String phoneNumber, String email, String office, double salary,int year, int month, int dayOfEmployment) {
		
		super.name = name;
		super.address = address;
		super.phoneNumber = phoneNumber;
		super.email = email;
		
		this.office = office;
		this.salary = salary;
		this.year = year;
		this.month = month;
		this.dayOfEmployment = dayOfEmployment;
		
	}//constructor with parameters
	
	public Employee () {
		
	}//default constructor

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}//end main method

	/**************************Set and Get Methods****************************/
	public String getOffice() {
		return office;
	}//end getOffice
	
	public double getSalary() {
		return salary;
	}//end getSalary
	
	public int getYear() {
		return year;
	}//end getYear
	
	public int getMonth() {
		return month;
	}//end getMonth
	
	public int getDayOfEmployment() {
		return dayOfEmployment;
	}//end date of employment
	
	public void setOffice(String office) {
		this.office = office;
	}//end setOffice
	
	public void setSalary(double salary) {
		this.salary = salary;
	}//end setSalary
	
	public void setYear(int year) {
		this.year = year;
	}//end setYear
	
	public void setMonth(int month) {
		this.month = month;
	}//end setMonth
	
	public void setDateOfEmployment(int dayOfEmployment) {
		this.dayOfEmployment = dayOfEmployment;
	}//end date of employment
	
	@Override
	public String toString() {
		String s = "Employee: " + name + "\nAddress: " + address + "\nPhone Number: " + phoneNumber + "\nEmail: " + email + "\nOffice: " + office + "\nSalary: " + salary + "\nDate of employment: Year: " + year + "| Month: " + month + "| Day:" + dayOfEmployment ;
		
		return s;
	}//end toString method
	
}//end class
