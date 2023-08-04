import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PetShelter {
    private Map<Integer, Pet> displayPets = new HashMap<Integer, Pet>();
Keyboard input = new Keyboard();
    public Collection<Pet> getAllPets() {
        return displayPets.values();
    }
    public void displayPets(){
    for(Pet pet : displayPets.values()){
        System.out.println(pet);
    }
    }

    public void addNewPet(Pet addVirtualOrRoboticPet) {
        this.displayPets.put(addVirtualOrRoboticPet.getPetKey(), addVirtualOrRoboticPet);
    }

    public void feedPet(){

    }
    public void PetToSleep(){

    }
    public void PlayWithPet(){

    }
    public void adoptPet(int petKey){
        displayPets();
        System.out.println("Choose a pet From the List: ");
        petKey = input.keyboardInt();
        this.displayPets.remove(petKey);
    }
    public void tick(){
        for(Pet allPets : displayPets.values()){
            allPets.tick();
        }
    }
}