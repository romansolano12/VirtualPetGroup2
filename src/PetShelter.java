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
        for (Pet singlePet : displayPets.values()) {
            singlePet.sleep(); 
        }
    }
    public void PlayWithPet(){
        for (Pet singlePet : displayPets.values()) {
            singlePet.play(); 
        }
    }

    public void OilRoboticPet(){
        
    }

    public void MaintenanceRoboticPet(){
        
    }

    public void adoptPet(int petKey){
        System.out.println("Choose a pet From the List: ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        displayPets();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Which Pet Would You Like To Adopt?(Type the Key Number of The Pet) ");
        petKey = input.keyboardInt();
        this.displayPets.remove(petKey);
    }
}