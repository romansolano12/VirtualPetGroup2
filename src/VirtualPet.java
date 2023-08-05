public class VirtualPet extends Pet {
    public VirtualPet( String petType, String petName, int petHealth, int petHappiness, int petSleep, int petHunger, int petThirst) {
        super( petType, petName, petHealth, petHappiness, petSleep);
        this.petHunger = petHunger;
        this.petThirst = petThirst;
    }

    private int petHunger;
    private int petThirst;

    public int getPetHunger() {
        return petHunger;
    }

    public void setPetHunger(int petHunger) {
        this.petHunger = petHunger;
    }

    public int getPetThirst() {
        return petThirst;
    }

    public void setPetThirst(int petThirst) {
        this.petThirst = petThirst;
    }
    public void feedPet(){
        petHunger--;
        int health = getPetHealth() + 1 ;
        setPetHealth(health);
    }
    public void waterPet(){
        petThirst--;
        int health = getPetHealth() + 1 ;
        setPetHealth(health);
    }
    @Override
    public String toString(){
        return "| Key: " + getPetKey()+"\t| Pet Type: Virtual " + getPetType() + "\t| Name: "+ getPetName()+"\t| Health: "+getPetHealth()+"%\t| Happiness: "+getPetHappiness()+"%\t| Sleep: "+getPetSleep()+"%\t| Hunger: "+petHunger+"%\t\t| Thirst: "+petThirst + "%\t | \n";
    }
}
