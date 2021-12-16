public class Bat extends Mammal {
    public Bat() {
        this.energyLevel=300;
    }

    public void fly() {
        System.out.println("Whoosh...");
        this.energyLevel -= 50;
    }

    public void eatHumans() {
        System.out.println("Earsplitting screams of terror and crunching sounds");
        this.energyLevel += 25;
    }

    public void attackTown() {
        System.out.println("Burn!!!! Earsplitting screams of terror")
        this.energyLevel -= 300;
    }
}
