/**
 * 
 */
package mainPackage;

import mammalPackage.Bat;
import mammalPackage.Gorilla;
import mammalPackage.Mammal;

/**
 * @author Timmyd
 *
 */
public class TestZooKeeper {

	public static void main(String[] args) {

		System.out.println("Welcome to Zoo Keeper");
		
		Mammal mammalOne = new Mammal();
		mammalOne.displayEnergy();
		
		Gorilla edward = new Gorilla();
		edward.displayEnergy();
		edward.throwSomething();
		edward.throwSomething();
		edward.throwSomething();
		edward.eatBananas();
		edward.eatBananas();
		edward.climb();
		edward.displayEnergy();
		
		Bat ivan = new Bat(300);
		ivan.displayEnergy();
		ivan.attackTown();
		ivan.attackTown();
		ivan.attackTown();
		ivan.eatHumans();
		ivan.eatHumans();
		ivan.fly();
		ivan.fly();
		ivan.displayEnergy();

	}

}
