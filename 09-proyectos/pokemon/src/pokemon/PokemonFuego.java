package pokemon;

public class PokemonFuego extends PokemonBaseImpl{

    public int golpeLlamarada = super.ataqueEspecial + 20;
    public int golpeBolaFuego = super.ataqueBasico;

    public PokemonFuego(String nombre) {
        super(nombre);
    }

    public PokemonFuego(String nombre, int vidaMaxima) {
        super(nombre, vidaMaxima);
    }

    public PokemonFuego(int numeroPokemon) {
        super(numeroPokemon);
    }

    @Override
    public void darGolpeEspecial() {
        System.out.println(this.golpeLlamarada + super.ataqueBasico);
    }

    public void saludar(){
        System.out.println("soy pokemon fuego");
    }

    @Override
    public void recibirGolpe(int golpe) {
        System.out.println("recibo golpe");
    }
}
