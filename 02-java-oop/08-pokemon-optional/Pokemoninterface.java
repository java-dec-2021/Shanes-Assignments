public interface Pokemoninterface {
    Pokemon createPokemon(String name, int health, String type);

    String pokemonInfo(Pokemon pokemon);

    void listPokemon();
}
