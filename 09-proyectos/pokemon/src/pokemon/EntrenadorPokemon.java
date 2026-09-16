package pokemon;

import utilidades.Utils;

public class EntrenadorPokemon {

    public String nombre ="";
    public int numeroPokemonsCapturados;
    public int getNumeroPokemonsVistos;

    public PokemonBaseImpl[] pokemons = new PokemonBaseImpl[PokemonBaseImpl.numeroPokemons];

    public int numeroPokeballs  = 3;
    public TIPOPokeballs tipoPokeballs;
    public  Pokeball []pokeballs = new Pokeball[numeroPokeballs];

    public EntrenadorPokemon(Pokeball[] pokeballs, int numeroPokeballs, String nombre) {
        this.pokeballs = pokeballs;
        this.numeroPokeballs = numeroPokeballs;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroPokemonsCapturados() {
        return numeroPokemonsCapturados;
    }

    public void setNumeroPokemonsCapturados(int numeroPokemonsCapturados) {
        this.numeroPokemonsCapturados = numeroPokemonsCapturados;
    }

    public int getGetNumeroPokemonsVistos() {
        return getNumeroPokemonsVistos;
    }

    public void setGetNumeroPokemonsVistos(int getNumeroPokemonsVistos) {
        this.getNumeroPokemonsVistos = getNumeroPokemonsVistos;
    }

    public PokemonBaseImpl[] getPokemons() {
        return pokemons;
    }

    public void setPokemons(PokemonBaseImpl[] pokemons) {
        this.pokemons = pokemons;
    }

    public int getNumeroPokeballs() {
        return numeroPokeballs;
    }

    public void setNumeroPokeballs(int numeroPokeballs) {
        this.numeroPokeballs = numeroPokeballs;
    }

    public TIPOPokeballs getTipoPokeballs() {
        return tipoPokeballs;
    }

    public void setTipoPokeballs(TIPOPokeballs tipoPokeballs) {
        this.tipoPokeballs = tipoPokeballs;
    }

    public Pokeball[] getPokeballs() {
        return pokeballs;
    }

    public void setPokeballs(Pokeball[] pokeballs) {
        this.pokeballs = pokeballs;
    }

    public boolean capturaPokemon() {

        return true;
    }

}
