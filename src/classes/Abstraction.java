package classes;

interface DogInterface {
	
	void bark();
	void poop();
};

abstract class DogAbstract {
	
	String breed;
	
	public void bark() {
		System.out.println("Bark!");
	};
	
	public abstract void poop();
	
};

class Chihuahua extends DogAbstract{

	public void poop() {
		System.out.println("Dog pooped!");
	};
};

public class Abstraction {

	public static void main(String[] args) {
		Chihuahua d = new Chihuahua();
		d.bark();
		d.poop();

	}

}
