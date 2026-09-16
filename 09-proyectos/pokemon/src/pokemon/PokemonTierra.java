package pokemon;

public class PokemonTierra extends PokemonBaseImpl{

    public int latigazo = 30;

    public PokemonTierra(String nombre) {
        super(nombre);
    }

    public PokemonTierra(String nombre, int vidaMaxima) {
        super(nombre, vidaMaxima);
    }

    public PokemonTierra(int numeroPokemon) {
        super(numeroPokemon);
    }


    @Override
    public void darGolpeEspecial() {
        System.out.println(super.ataqueBasico + this.latigazo);
    }

    @Override
    public void saludar() {
        System.out.println("soy pokemon de Tierra");
    }
}
