package L_Three;

public class HirericalCar {
	 public static void main(String[] args) {
	        Car c = new Car();
	        c.move(); 
	        
	        System.out.println();
	        
	        Bike b = new Bike();
	        b.move(); 
	    }

	}

	class Vehicle {
	    public void move() {
	        System.out.println("A vehical is moving");
	    }
	}

	class Car extends Vehicle{}

	class Bike extends Vehicle{}

