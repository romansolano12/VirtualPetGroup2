
public class AddPet {
    String petType;
    Keyboard input = new Keyboard();

    /*
     * Add Pet Menu
     */
    public Pet AddNewPet() {
        boolean menu = true;
return NewVirtualPet();
        // Pet pet;
        // while (menu) {
        //     System.out.println("Which type of pet would you like to add? ");
        //     System.out.println("0. Quit");
        //     System.out.println("1. Virtual Pet");
        //     System.out.println("2. Robotic Pet");
        //     int option = input.keyboardInt();
        //     switch (option) {
        //         case 0: {
        //             menu = false;
        //             break;
        //         }
        //         case 1: {
        //             pet= NewVirtualPet();
        //             menu=false;
        //             break;
                    
        //         }
        //         case 2: {
        //             pet= NewRoboticPet();
        //         menu=false;
        //         break;
        //         }
        //         default: {
        //             System.out.println("Please enter a value from 0 to 2.");
        //         }
        //     }
        //     return pet;
        // }
        
    }

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
