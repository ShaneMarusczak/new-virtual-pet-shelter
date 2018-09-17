package virtualpetshelter;

import java.util.Collection;
import java.util.HashMap;

public class VirtualPetShelter {

	HashMap<String, VirtualPet> shelter = new HashMap<String, VirtualPet>();

	public void addPet(String name, VirtualPet pet) {
		shelter.put(name, pet);
	}

	public HashMap<String, VirtualPet> getAllPets() {
		return shelter;
	}

	public VirtualPet getPet(String name) {
		return shelter.get(name);
	}

	public void removePet(String name) {
		shelter.remove(name);

	}

	public void feedAllPets() {
		for (VirtualPet pet : shelter.values()) {
			pet.giveFood();
		}

	}

	public void waterAllPets() {
		for (VirtualPet pet : shelter.values()) {
			pet.giveDrink();
		}

	}

	public void playWithSinglePet(String name) {
		shelter.get(name).playWith();

	}

	public void giveDrinkToSinglePet(String name) {
		shelter.get(name).giveDrink();

	}

	public void giveFoodToSinglePet(String name) {
		shelter.get(name).giveFood();

	}

	public void tick() {
		for (VirtualPet pet : shelter.values()) {
			pet.increaseBoredom();
			pet.decraseHappiness();
			pet.increaseHunger();
			pet.increaseThirst();
			pet.makeCageDirty();
		}
	}

	public void cleanSinglePetCage(String name) {
		shelter.get(name).cleanCage();
	}
}
