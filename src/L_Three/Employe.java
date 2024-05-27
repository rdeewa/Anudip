package L_Three;
abstract class Employee {
	String name;
	int employeeId;
	public Employee(String name, int employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}
	// Abstract method to calculate pay
	abstract double calculatePay();
	public void display() {
		System.out.println("Employe Name is:" +name);
		System.out.println("Employe Id is:" +employeeId);
		System.out.println("Employe pay is:" +calculatePay());
	}
}
class SalariedEmployee extends Employee {
	double annualSalary;
	public SalariedEmployee(String name, int employeeId, double annualSalary) {
		super(name, employeeId);
		this.annualSalary = annualSalary;
	}
	double calculatePay() {
		return annualSalary / 12;
	}
}
class HourlyEmployee extends Employee {
	double hourlyRate;
	int hoursWorked;
	public HourlyEmployee(String name, int employeeId, double hourlyRate, int hoursWorked) {
		super(name, employeeId);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	double calculatePay() {
		return hourlyRate * hoursWorked;
	}
}
public class Employe {
	public static void main(String[] args) {
		// Creating a salaried employee
		Employee AS = new SalariedEmployee("Deewa", 101, 60000);
		System.out.println("Annual Salaried Pay: " + AS.calculatePay());
		AS.display();
		System.out.println();
		// Creating an hourly employee
		Employee HS = new HourlyEmployee("Riya", 102, 20, 160);
		System.out.println("Hourly Salaried Pay: " + HS.calculatePay());
		HS.display();
	}
}

