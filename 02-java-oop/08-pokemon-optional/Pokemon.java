public class Pokemon {
    public String name = "Bulbasaur";
    public int health = 100;
    public String type = "Poison/Grass";
    private static int count = 0;

    public void attackPokemon(Pokemon pokemon) {
        pokemon.health -= 10;
    }

    public Pokemon(String name, int health, String type) {
        this.name = name;
        this.health = health;
        this.type = type;
        count += 1;
    }
    
    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public String getType() {
        return this.Type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setType(String type) {
        this.type = type;
    }
}
