package mammalPackage;

public class Mammal {
	
	public int energyLevel;

	public Mammal() {
		super();
		this.energyLevel = 100;
	}
	
	public Mammal(int energy) {
		super();
		this.energyLevel = energy;
	}

	public int displayEnergy() {
		System.out.println("The mammals current energy level is: " + this.energyLevel);
		return this.energyLevel;
	}


}
