package pokemon;

public class PokemonAgua extends PokemonBaseImpl{

    public int golpeAcuatico = 10;

    public PokemonAgua(String nombre) {
        super(nombre);
    }

    public PokemonAgua(String nombre, int vidaMaxima) {
        super(nombre, vidaMaxima);
    }

    public PokemonAgua(int numeroPokemon) {
        super(numeroPokemon);
    }

    @Override
    public void darGolpeEspecial() {

    }

    @Override
    public void saludar() {
        System.out.println("Soy Pokemon Agua");
    }


}
