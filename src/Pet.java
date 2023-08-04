/**
 * this abstract class is for all pets
 */

public abstract class Pet {
    // variables for the pet class
    private static int petCounter = 1;
    private String petName;
    private int petHealth;
    private int petHappiness;
    private int petSleep;
    private int petKey;
    private String petType;

    // getter and setter for all pet variables

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public int getPetKey() {
        return petKey;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetHealth() {
        return petHealth;
    }

    public void setPetHealth(int petHealth) {
        this.petHealth = petHealth;
    }

    public int getPetHappiness() {
        return petHappiness;
    }

    public void setPetHappiness(int petHappiness) {
        this.petHappiness = petHappiness;
    }

    public int getPetSleep() {
        return petSleep;
    }

    public void setPetSleep(int petSleep) {
        this.petSleep = petSleep;
    }

    public Pet( String petType, String petName, int petHealth, int petHappiness, int petSleep) {
        this.petKey = petCounter++;
        this.petType = petType;
        this.petName = petName;
        this.petHealth = petHealth;
        this.petHappiness = petHappiness;
        this.petSleep = petSleep;
    }

    /**
     * this function will increase pet sleep by 1 and pet health by 1
     */
    public void sleep() {
        petSleep++;
        petHealth++;
    }

    /**
     * this function will increase pet happiness by 1 and pet health by 1
     */
    public void play() {
        petHappiness++;
        petHealth++;
    }
    public void tick(){
        petHappiness--;
        petHealth--;
        petSleep--;
    }
}
