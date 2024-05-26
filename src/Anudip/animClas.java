package Anudip;

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
public class animClas { 
	public static void main(String[] args) {
    Animal animal = new Animal(); 
    animal.makeSound(); 
	    
	}

}
