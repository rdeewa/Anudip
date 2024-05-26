package Anudip;

public class EmployeeDemo {
    // Abstract base class
    abstract static class Employee {
        public abstract double calculatePay();
    }

    // Subclass for salaried employees
    static class SalariedEmployee extends Employee {
        private String name;
        private double annualSalary;

        public SalariedEmployee(String name, double annualSalary) {
            this.name = name;
            this.annualSalary = annualSalary;
        }

        @Override
        public double calculatePay() {
            // Assuming monthly pay
            return annualSalary / 12;
        }

        public String getName() {
            return name;
        }
    }

    // Subclass for hourly employees
    static class HourlyEmployee extends Employee {
        private String name;
        private double hourlyRate;
        private int hoursWorked;

        public HourlyEmployee(String name, double hourlyRate, int hoursWorked) {
            this.name = name;
            this.hourlyRate = hourlyRate;
            this.hoursWorked = hoursWorked;
        }

        @Override
        public double calculatePay() {
            // Assuming weekly pay
            return hourlyRate * hoursWorked;
        }

        public String getName() {
            return name;
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create a salaried employee
        SalariedEmployee salariedEmployee = new SalariedEmployee("Alice", 60000);
        System.out.println("Salaried Employee: " + salariedEmployee.getName() + ", Monthly Pay: " + salariedEmployee.calculatePay());

        // Create an hourly employee
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Bob", 20, 40);  // $20 per hour, 40 hours a week
        System.out.println("Hourly Employee: " + hourlyEmployee.getName() + ", Weekly Pay: " + hourlyEmployee.calculatePay());
    }
}

