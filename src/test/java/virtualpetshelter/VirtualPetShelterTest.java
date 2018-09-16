package virtualpetshelter;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VirtualPetShelterTest {

	VirtualPetShelter shelter = new VirtualPetShelter();
	VirtualPet testPet = new VirtualPet("steve", "fun");
	VirtualPet testPet2 = new VirtualPet("bob", "fun");
	VirtualPet testPet3 = new VirtualPet("fred", "boring");

	@Test
	public void shouldBeAbleToAddPet() {
		int beginningSize = shelter.getAllPets().size();
		shelter.addPet("steve", testPet);
		int endingSize = shelter.getAllPets().size();
		assertTrue(endingSize > beginningSize);
	}

	@Test
	public void shouldBeAbleToGetPet() {
		shelter.addPet("steve", testPet);
		VirtualPet testPetGet = shelter.getPet("steve");
		assertThat(testPetGet, is(testPet));
	}

	@Test
	public void shouldBeAbleToRemovePet() {
		shelter.addPet("steve", testPet);
		int beginningSize = shelter.getAllPets().size();
		shelter.removePet("steve");
		int endingSize = shelter.getAllPets().size();
		assertTrue(endingSize < beginningSize);
	}

	@Test
	public void shouldBeAbleToFeedAllPets() {
		shelter.addPet("steve", testPet);
		shelter.addPet("bob", testPet2);
		shelter.addPet("fred", testPet3);
		int startingHunger1 = shelter.getPet("steve").getHunger();
		int startingHunger2 = shelter.getPet("bob").getHunger();
		int startingHunger3 = shelter.getPet("fred").getHunger();
		shelter.feedAllPets();
		int endingHunger1 = shelter.getPet("steve").getHunger();
		int endingHunger2 = shelter.getPet("bob").getHunger();
		int endingHunger3 = shelter.getPet("fred").getHunger();
		assertTrue(startingHunger1 > endingHunger1);
		assertTrue(startingHunger2 > endingHunger2);
		assertTrue(startingHunger3 > endingHunger3);
	}

	@Test
	public void shouldBeAbleToWaterAllPets() {
		shelter.addPet("steve", testPet);
		shelter.addPet("bob", testPet2);
		shelter.addPet("fred", testPet3);
		int startingThirst1 = shelter.getPet("steve").getThirst();
		int startingThirst2 = shelter.getPet("bob").getThirst();
		int startingThirst3 = shelter.getPet("fred").getThirst();
		shelter.waterAllPets();
		int endingThirst1 = shelter.getPet("steve").getThirst();
		int endingThirst2 = shelter.getPet("bob").getThirst();
		int endingThirst3 = shelter.getPet("fred").getThirst();
		assertTrue(startingThirst1 > endingThirst1);
		assertTrue(startingThirst2 > endingThirst2);
		assertTrue(startingThirst3 > endingThirst3);
	}

	@Test
	public void shouldBeAbleToPlayWithOnePet() {
		shelter.addPet("steve", testPet);
		shelter.addPet("bob", testPet2);
		shelter.addPet("fred", testPet3);
		float startingHappiness1 = shelter.getPet("steve").getHappiness();
		float startingHappiness2 = shelter.getPet("bob").getHappiness();
		float startingHappiness3 = shelter.getPet("fred").getHappiness();
		shelter.playWithSinglePet("steve");
		float endingHappiness1 = shelter.getPet("steve").getHappiness();
		int endingHappiness2 = shelter.getPet("bob").getHappiness();
		int endingHappiness3 = shelter.getPet("fred").getHappiness();
		assertTrue(startingHappiness1 < endingHappiness1);
		assertTrue(startingHappiness2 == endingHappiness2);
		assertTrue(startingHappiness3 == endingHappiness3);
	}

	@Test
	public void shouldBeAbleToWaterOnePet() {
		shelter.addPet("steve", testPet);
		shelter.addPet("bob", testPet2);
		shelter.addPet("fred", testPet3);
		int startingThirst1 = shelter.getPet("steve").getThirst();
		int startingThirst2 = shelter.getPet("bob").getThirst();
		int startingThirst3 = shelter.getPet("fred").getThirst();
		shelter.giveDrinkToSinglePet("steve");
		int endingThirst1 = shelter.getPet("steve").getThirst();
		int endingThirst2 = shelter.getPet("bob").getThirst();
		int endingThirst3 = shelter.getPet("fred").getThirst();
		assertTrue(startingThirst1 > endingThirst1);
		assertTrue(startingThirst2 == endingThirst2);
		assertTrue(startingThirst3 == endingThirst3);
	}

	@Test
	public void shouldBeAbleToFeedOnePet() {
		shelter.addPet("steve", testPet);
		shelter.addPet("bob", testPet2);
		shelter.addPet("fred", testPet3);
		int startingHunger1 = shelter.getPet("steve").getHunger();
		int startingHunger2 = shelter.getPet("bob").getHunger();
		int startingHunger3 = shelter.getPet("fred").getHunger();
		shelter.giveFoodToSinglePet("steve");
		int endingHunger1 = shelter.getPet("steve").getHunger();
		int endingHunger2 = shelter.getPet("bob").getHunger();
		int endingHunger3 = shelter.getPet("fred").getHunger();
		assertTrue(startingHunger1 > endingHunger1);
		assertTrue(startingHunger2 == endingHunger2);
		assertTrue(startingHunger3 == endingHunger3);
	}

	@Test
	public void shouldChangePetWithTick() {
		shelter.addPet("steve", testPet);
		shelter.addPet("bob", testPet2);
		shelter.addPet("fred", testPet3);
		int startingHunger1 = shelter.getPet("steve").getHunger();
		int startingHunger2 = shelter.getPet("bob").getHunger();
		int startingHunger3 = shelter.getPet("fred").getHunger();
		int startingThirst1 = shelter.getPet("steve").getThirst();
		int startingThirst2 = shelter.getPet("bob").getThirst();
		int startingThirst3 = shelter.getPet("fred").getThirst();
		int startingHappiness1 = shelter.getPet("steve").getHappiness();
		int startingHappiness2 = shelter.getPet("bob").getHappiness();
		int startingHappiness3 = shelter.getPet("fred").getHappiness();
		int startingBoredom1 = shelter.getPet("steve").getBoredom();
		int startingBoredom2 = shelter.getPet("bob").getBoredom();
		int startingBoredom3 = shelter.getPet("fred").getBoredom();
		shelter.tick();
		int endingHunger1 = shelter.getPet("steve").getHunger();
		int endingHunger2 = shelter.getPet("bob").getHunger();
		int endingHunger3 = shelter.getPet("fred").getHunger();
		int endingThirst1 = shelter.getPet("steve").getThirst();
		int endingThirst2 = shelter.getPet("bob").getThirst();
		int endingThirst3 = shelter.getPet("fred").getThirst();
		int endingHappiness1 = shelter.getPet("steve").getHappiness();
		int endingHappiness2 = shelter.getPet("bob").getHappiness();
		int endingHappiness3 = shelter.getPet("fred").getHappiness();
		int endingBoredom1 = shelter.getPet("steve").getBoredom();
		int endingBoredom2 = shelter.getPet("bob").getBoredom();
		int endingBoredom3 = shelter.getPet("fred").getBoredom();
		assertTrue(startingHunger1 < endingHunger1);
		assertTrue(startingHunger2 < endingHunger2);
		assertTrue(startingHunger3 < endingHunger3);
		assertTrue(startingHappiness1 > endingHappiness1);
		assertTrue(startingHappiness2 > endingHappiness2);
		assertTrue(startingHappiness3 > endingHappiness3);
		assertTrue(startingThirst1 < endingThirst1);
		assertTrue(startingThirst2 < endingThirst2);
		assertTrue(startingThirst3 < endingThirst3);
		assertTrue(startingBoredom1 < endingBoredom1);
		assertTrue(startingBoredom2 < endingBoredom2);
		assertTrue(startingBoredom3 < endingBoredom3);

	}

	@Test
	public void shouldBeAbleToCleanCageOfOnePet() {
		shelter.addPet("steve", testPet);
		shelter.addPet("bob", testPet2);
		shelter.addPet("fred", testPet3);
		int startingCleanliness1 = shelter.getPet("steve").getCageCleanliness();
		int startingCleanliness2 = shelter.getPet("bob").getCageCleanliness();
		int startingCleanliness3 = shelter.getPet("fred").getCageCleanliness();
		shelter.cleanSinglePetCage("steve");
		int endingCleanliness1 = shelter.getPet("steve").getCageCleanliness();
		int endingCleanliness2 = shelter.getPet("bob").getCageCleanliness();
		int endingCleanliness3 = shelter.getPet("fred").getCageCleanliness();
		assertTrue(startingCleanliness1 > endingCleanliness1);
		assertTrue(startingCleanliness2 == endingCleanliness2);
		assertTrue(startingCleanliness3 == endingCleanliness3);
	}

}
