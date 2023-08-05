
public class AddPet {
    String petType;
    Keyboard input = new Keyboard();
    
    // Asks User (when adding a new virtual or robotic pet) if they want to add a Dog or a Cat
    public void CatOrDog() {
        System.out.println("What type of pet would you like to add? ");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        int option = input.keyboardInt();
        // Sets the pet type to dog
        if (option == 1) {
            petType = "Dog";
        } 
        // Stets the pet type to cat
        else if (option == 2) {
            petType = "Cat";
        }
        // Else it loops back 
        else {
            CatOrDog();
        }
    }

    // Add New Virtual Pet
    public VirtualPet NewVirtualPet() {
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("|\tAdd New Virtual Pet\t|");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // Asks user if they want to add a Dog or a Cat
        CatOrDog();
        // Asks User for pet name
        System.out.println("Enter Pet's Name: ");
        // Sets pet Name
        String petName = input.keyboardString();
        // Sets all attributes to 50%
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
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("|\tAdd New Robotic Pet\t|");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
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
