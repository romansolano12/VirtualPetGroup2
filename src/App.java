public class App {
    public static void main(String[] args) throws Exception {
        PetShelter petShelter = new PetShelter();
        Keyboard input = new Keyboard();
        VirtualPet pet1 = new VirtualPet("Dog", "Ace", 50, 50, 50, 50, 50);
        RoboticPet pet2 = new RoboticPet("Cat", "Annie", 50, 50, 50, 50, 50);
        petShelter.addNewPet(pet1);
        petShelter.addNewPet(pet2);
        // Pet newPet= new Pet();

        while (true) {
            VirtualPet pet3 = new VirtualPet(null, null, 0, 0, 0, 0, 0);
            RoboticPet pet4 = new RoboticPet(null, null, 0, 0, 0, 0, 0);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            petShelter.displayPets();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("0. Exit Application");
            System.out.println("1. Put All Pets to Sleep");
            System.out.println("2. Play with All Pets");
            System.out.println("3. Pick a pet");
            System.out.println("4. Adopt a pet");
            System.out.println("5. Admit a Virtual pet");
            System.out.println("6. Admit a Robotic pet");
            System.out.println("What would you like to do next?");
            int option = input.keyboardInt();
            switch (option) {
                case 0: {
                    break;
                }
                case 1: {
                    petShelter.PetToSleep();
                    break;
                }
                case 2: {
                    petShelter.PlayWithPet();
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    petShelter.adoptPet(0);
                    break;
                }
                case 5: {
                    AddPet addPet = new AddPet();
                    pet3 = addPet.NewVirtualPet();
                    petShelter.addNewPet(pet3);
                    break;
                }
                case 6: {
                    AddPet addPet = new AddPet();
                    pet4 = addPet.NewRoboticPet();
                    petShelter.addNewPet(pet4);
                    break;
                }
                default: {
                    System.out.println("Invalid option");
                }
            }
        }
    }
}
