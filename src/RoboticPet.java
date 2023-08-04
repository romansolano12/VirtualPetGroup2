public class RoboticPet extends Pet {
    
    private int petOilLevel;
    private int petMaintenance;

    public RoboticPet( String petType, String petName, int petHealth, int petHappiness, int petSleep,int petOilLevel,int petMaintenance) {
        super( petType, petName, petHealth, petHappiness, petSleep);
        this.petOilLevel=petOilLevel;
        this.petMaintenance=petMaintenance;
    }


    public int getPetOilLevel() {
        return petOilLevel;
    }

    public void setPetOilLevel(int petOilLevel) {
        this.petOilLevel = petOilLevel;
    }

    public int getPetMaintenance() {
        return petMaintenance;
    }

    public void setPetMaintenance(int petMaintenance) {
        this.petMaintenance = petMaintenance;
    }

    public void oilPet() {
        petOilLevel++;
    }

    public void maintenance() {
        petMaintenance++;
    }

    @Override
    public String toString(){
        return "| Key: " + getPetKey() + "\t| Pet Type: Robotic " + getPetType() +"\t| Name: "+getPetName()+"\t| Health: "+getPetHealth()+ "\t| Happiness: "+getPetHappiness()+"\t| Sleep: "+getPetSleep() + "\t| Maintenance: "+petMaintenance
        + "\t| Oil Level: "+petOilLevel + " |\n";
    }
}