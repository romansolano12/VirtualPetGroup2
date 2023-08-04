public class App {
    public static void main(String[] args) throws Exception {
        PetShelter petShelter = new PetShelter();
        Keyboard input = new Keyboard();
        VirtualPet pet1 = new VirtualPet("Dog", "Ace", 50, 50, 50, 50, 50);
        RoboticPet pet2 = new RoboticPet("Cat", "Annie", 50, 50, 50, 50, 50);
        Pet pet;
        petShelter.addNewPet(pet1);
        petShelter.addNewPet(pet2);
        // Pet newPet= new Pet();

        while (true) {
            petShelter.tick();
            VirtualPet virtualPet = new VirtualPet(null, null, 0, 0, 0, 0, 0);
            RoboticPet roboticPet = new RoboticPet(null, null, 0, 0, 0, 0, 0);
            petShelter.displayPets();
            System.out.println("0. Exit Application");
            System.out.println("1. Put Pets to Sleep");
            System.out.println("2. Play with pet");
            System.out.println("3. Pick a pet");
            System.out.println("4. Adopt a pet");
            System.out.println("5. Admit a Virtual pet");
            System.out.println("6. Admit a Robotic pet");

            System.out.println("What would you like to do next?");
            int option = input.keyboardInt();
            int keyValue = -1;
            while (option == 3 || option == 4) {
                petShelter.displayPets();
                System.out.println("pick a pet number");
                keyValue = input.keyboardInt();
                pet = petShelter.getPet(keyValue);
                if (pet != null) {
                    break;
                }
                System.out.println("I cant find this pet try again");
            }
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
                    petShelter.adoptPet(keyValue);
                    break;
                }
                case 5: {
                    AddPet addPet = new AddPet();
                    virtualPet = addPet.NewVirtualPet();
                    petShelter.addNewPet(virtualPet);
                    break;
                }
                case 6: {
                    AddPet addPet = new AddPet();
                    roboticPet = addPet.NewRoboticPet();
                    petShelter.addNewPet(roboticPet);
                    break;
                }
                default: {
                    System.out.println("Invalid option");
                }
            }
        }
    }
}
