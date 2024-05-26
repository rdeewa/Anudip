package Anudip;

public class constructor_print {
	int empcode;
	String city;
	String name;
	constructor_print(int empcode, String city, String name){
		this.empcode=empcode;
		this.city=city;
		this.name=name;
	}
	public String toString() {
		return empcode+" "+city+" "+name;
	}
	public static void main(String args[]) {
		constructor_print h = new constructor_print(123,"Mumbai","deewa");
		System.out.println(h);
	}
	

}
