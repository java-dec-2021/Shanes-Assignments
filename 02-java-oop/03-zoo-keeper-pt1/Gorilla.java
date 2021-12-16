public class Gorilla extends Mammal {
    public Gorilla() {
    }

    public Gorilla(String name) {
        this.name = name;
    }

    public void throwSomething(String item) {
        String thrown = String.format("%s was thrown.", item);
        System.out.println(thrown);
        energyLevel -= 5;
    }

    public void eatBananas() {
        energyLevel += 10;
        String message = String.format("%s burps with satisfaction.", name);
        System.out.println(message);
    }

    public void climb() {
        String message = String.format("%s climbs a tree.", name);
        energyLevel -= 10;
        System.out.println(message);
    }
}
