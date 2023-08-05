import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PetShelter {
    private Map<Integer, Pet> displayPets = new HashMap<Integer, Pet>();
    Keyboard input = new Keyboard();

    public Collection<Pet> getAllPets() {
        return displayPets.values();
    }

    public void displayPets() {
        for (Pet pet : displayPets.values()) {
            System.out.println(pet);
        }
    }

    public Pet getPet(int keyValue) {
        return this.displayPets.get(keyValue);
    }

    public void addNewPet(Pet addVirtualOrRoboticPet) {
        this.displayPets.put(addVirtualOrRoboticPet.getPetKey(), addVirtualOrRoboticPet);
    }


    public void givePetWater(){
        for (Pet singlePet : displayPets.values()) {
            if (singlePet instanceof VirtualPet) {
                ((VirtualPet) singlePet).waterPet();
            }
        }
    }
    public void feedPet() {

        for (Pet singlePet : displayPets.values()) {
            if (singlePet instanceof VirtualPet) {
                ((VirtualPet) singlePet).feedPet();
            }
        }
    }

    public void PetToSleep() {
        for (Pet singlePet : displayPets.values()) {
            singlePet.sleep();
        }
    }

    public void PlayWithPet() {
        for (Pet singlePet : displayPets.values()) {
            singlePet.play();
        }
    }

    public void OilRoboticPet() {

        for (Pet singlePet : displayPets.values()) {
            if (singlePet instanceof RoboticPet) {
                ((RoboticPet) singlePet).oilPet();
            }
        }
    }

    public void MaintenanceRoboticPet() {
        for (Pet singlePet : displayPets.values()) {
            if (singlePet instanceof RoboticPet) {
                ((RoboticPet) singlePet).maintenance();
            }
        }


    }


    public void adoptPet(int petKey) {

        System.out.println(
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        displayPets();
        System.out.println(
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        this.displayPets.remove(petKey);
    }



    public void tickPet() {

        for (Pet allPets : displayPets.values()) {
            allPets.tick();
        }
        for (Pet singlePet : displayPets.values()) {
            if (singlePet instanceof VirtualPet) {
                ((VirtualPet) singlePet).virtualTick();
            }
            else if (singlePet instanceof RoboticPet){
                ((RoboticPet) singlePet).roboticTick();
            }
        }


    }
}