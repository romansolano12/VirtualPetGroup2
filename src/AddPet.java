
public class AddPet {
    String petType;
    Keyboard input = new Keyboard();
    
    public void CatOrDog() {
        System.out.println("What type of pet would you like to add? ");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        int option = input.keyboardInt();
        if (option == 1) {
            petType = "Dog";
        } else if (option == 2) {
            petType = "Cat";
        } else {
            CatOrDog();
        }
    }

    // Add New Virtual Pet
    public VirtualPet NewVirtualPet() {

        System.out.println("Add New Virtual Pet");
        CatOrDog();
        System.out.println("Enter Pet's Name: ");
        String petName = input.keyboardString();
        int petHealth = 50;
        int petHappiness = 50;
        int petSleep = 50;
        int petHunger = 50;
        int petThirst = 50;
        VirtualPet newPet = new VirtualPet(petType, petName, petHealth, petHappiness, petSleep, petHunger,
                petThirst);
        return newPet;
    }

    // Add New Robotic Pet
    public RoboticPet NewRoboticPet() {
        System.out.println("Add New Robotic Pet");
        CatOrDog();
        System.out.println("Enter Pet's Name: ");
        String petName = input.keyboardString();
        int petHealth = 50;
        int petHappiness = 50;
        int petSleep = 50;
        int petOilLevel = 50;
        int petMaintenance = 50;
        RoboticPet newPet = new RoboticPet(petType, petName, petHealth, petHappiness, petSleep, petOilLevel,
                petMaintenance);
        return newPet;
    }
}
