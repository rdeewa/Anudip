package L_Three;


public class PersonStudent {
	public static void main(String[] args) {
		student st = new student(2, "deewa", 12);
		st.display();
	}

}

class person {
	private int age;
	private String name;

	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

class student extends person {
	private int stdID;

	public student(int stdID, String name, int age) {
		super(name, age);
		this.stdID = stdID;
	}


	public void display() {
		super.display(); 
		System.out.println("Student ID: " + stdID);
	}
}
