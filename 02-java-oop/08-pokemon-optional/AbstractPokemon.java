public abstract class AbstractPokemon implements PokemonInterface{
    Pokemon createPokemon(String name, int health, String type){
        return new Pokemon(name, health, type);
    }
}
