package mammalPackage;

public class Gorilla extends Mammal{

	public Gorilla() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void throwSomething() {
		this.energyLevel = this.energyLevel - 5;
		System.out.println("The Gorilla has thrown something, the current energy level is: " + this.energyLevel);
	}
	
	public void eatBananas() {
		this.energyLevel = this.energyLevel + 10;
		System.out.println("The Gorilla has eaten bananas, the current energy level is: " + this.energyLevel);
	}
	
	public void climb() {
		this.energyLevel = this.energyLevel - 10;
		System.out.println("The Gorilla was climbing, the current energy level is: " + this.energyLevel);
	}
	
}
