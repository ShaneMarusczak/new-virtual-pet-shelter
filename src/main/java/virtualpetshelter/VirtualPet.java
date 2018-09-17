package virtualpetshelter;

import java.util.Random;

public class VirtualPet {
	private Random rand = new Random();
	private int hunger;
	private int thirst;
	private int boredom;
	private int happiness;
	private String name;
	private String description;
	private int cageCleanliness;
	private int DNA = rand.nextInt(3) + 1;

	VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
	}

	VirtualPet(String name, String description, int hunger, int thirst, int boredom, int happiness) {
		this.name = name;
		this.description = description;
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
		this.happiness = happiness;
	}

	@Override
	public String toString() {
		return name + "      " + hunger + "          " + thirst + "          " + boredom + "           " + happiness;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getCageCleanliness() {
		return cageCleanliness;
	}

	public void cleanCage() {
		cageCleanliness -= 1;
	}

	public void makeCageDirty() {
		cageCleanliness += 1;
	}

	public int getHunger() {
		return hunger;
	}

	public void giveFood() {
		hunger -= 15;
		thirst += 2;
		happiness += 3;
	}

	public int getThirst() {
		return thirst;
	}

	public void giveDrink() {
		thirst -= 15;
		hunger += 2;
		happiness += 3;
	}

	public int getHappiness() {
		return happiness;
	}

	public void increaseBoredom() {
		boredom += ((rand.nextInt(3) + 2) * DNA);
	}

	public void increaseHunger() {
		hunger += ((rand.nextInt(3) + 2) * DNA);
	}

	public void increaseThirst() {
		thirst += ((rand.nextInt(3) + 2) * DNA);
	}

	public void decraseHappiness() {
		happiness -= ((rand.nextInt(4) + 2) * DNA);
	}

	public void playWith() {
		happiness += (4 * DNA);
		boredom -= (3 * DNA);

	}

	public int getBoredom() {
		return boredom;
	}
}