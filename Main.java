

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Rey Skywalker", "4123 Moisture Farm, Outer Rim, Tatooine", "444-444-444", "ReyOFHope@students.kennesaw.edu");
		Student s = new Student("Ben Solo", "78 Jedi Temple, Outer Rim", "444-444-5673", "Bsolo@students.kennesaw.edu", "Freshman");
		Employee em = new Employee("Han Solo", "Captain's Quarters, Millennium Falcon", "456-123-7892", "Hsolo@students.kennesaw.edu", "Cockpit of Millennium Falcon Pilot's Chair", 10000.00, 1975, 12, 5);
		Faculty f = new Faculty("Luke Skywalker", "789 Hermit's Retreat, Ahch-To","456-123-7891", "LSkywalk@students.kennesaw.edu", "Penthoue room in Temple", 50000.00, 1975,12,5, "5 hours", "Senior");
		Staff st = new Staff("Leia Organa-Solo", "789 Resistance base, Outer Rim, D'Qar", "456-123-7890", "LOrgana@students.kennesaw.edu", "Resistance Camp", 550000.00,1975,12,5, "General");
		
		System.out.println(p);
		System.out.println();
		System.out.println(s);
		System.out.println();
		System.out.println(em);
		System.out.println();
		System.out.println(f);
		System.out.println();
		System.out.println(st);
	}

}
