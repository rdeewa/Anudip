package L_Two;

class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}
public class Animalclass { 
	public static void main(String[] args) {
    Animal animal = new Animal(); 
    animal.makeSound(); 
	    
	}

}
