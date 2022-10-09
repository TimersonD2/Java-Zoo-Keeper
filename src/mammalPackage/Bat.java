package mammalPackage;

public class Bat extends Mammal{

	public Bat(int energy) {
		super(energy);
		// TODO Auto-generated constructor stub
	}
	
	public void attackTown() {
		this.energyLevel = this.energyLevel - 100;
		System.out.println("Crackle, opp, boom as the flames got higher, the current energy level is: " + this.energyLevel);
	}
	
	public void eatHumans() {
		this.energyLevel = this.energyLevel + 25;
		System.out.println("Um yeah...., the current energy level is: " + this.energyLevel);
	}
	
	public void fly() {
		this.energyLevel = this.energyLevel - 50;
		System.out.println("The phap phap phap the Bat is flying, the current energy level is: " + this.energyLevel);
	}
	
}
