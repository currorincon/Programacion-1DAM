package pokemon;

import utilidades.Utils;

public class Principal {

    public static void main(String[] args) {

//        Pokeball[] pokeballs = new Pokeball[3];
//
//        for (int i = 0; i < pokeballs.length; i++) {
//            pokeballs[i] = new Pokeball();
//        }
//
//        EntrenadorPokemon entrenadorPokemon = new EntrenadorPokemon(pokeballs, 3, "Curro");
//        entrenadorPokemon.setNombre("Curro");
//
//       PokemonBaseImpl[] pokemons = new PokemonBaseImpl[PokemonBaseImpl.numeroPokemons];
//
//        for (int i = 0; i < pokemons.length; i++) {
//            pokemons[i] = new PokemonBaseImpl(i);
//            pokemons[i].setNombre("Pokemon"+i);
//
//            int numeroAzar = Utils.pedirNumeroAleatorio(1,4);
//
//            switch (numeroAzar){
//                case 1:
//                    pokemons[i].setTipo(TIPOPokemon.AGUA);
//                    break;
//                case 2:
//                    pokemons[i].setTipo(TIPOPokemon.FUEGO);
//                    break;
//                case 3:
//                    pokemons[i].setTipo(TIPOPokemon.TIRRA);
//                    break;
//                default:
//                    pokemons[i].setTipo(TIPOPokemon.FANTASMA);
//            }
//
//            System.out.println(pokemons[i]);
//
//        }
//

            PokemonFuego pokemonFuego = new PokemonFuego("curro");
            pokemonFuego.saludar();

            PokemonAgua pokemonAgua = new PokemonAgua("curro");
            pokemonAgua.saludar();

            PokemonTierra pokemonTierra = new PokemonTierra("curro");
            pokemonTierra.saludar();

    }

}
