package pokemon;

public abstract class PokemonBaseImpl implements Pokemon {

    public static int numeroPokemons = 151;

    //Atributos globales
    private int vidaActual = 100;
    public int vidaMaxima = 100;
    public String nombre = "";
    public int ataqueBasico = 5;
    public int ataqueEspecial = 20;
    public int defensa =50;
    public boolean vivo = true;

    public int golpe = 5;
    //Variable para comprobar si un pokemon esta capturado
    //EN CASO DE QUE NO ESTE CAPTURADO; SIGNIFICA QUE ESTA LIBRE Y VISTO
    public boolean capturado = false;

    private int numeroPokemon = 0;

    public TIPOPokemon tipo = TIPOPokemon.FUEGO;

    /**
     * Constructor vacio
     */
    private PokemonBaseImpl(){

    }

    /**
     * Contructor publico para inicializar con un nombre al pokemon
     * @param nombre
     */
    public PokemonBaseImpl(String nombre){
        this.nombre = nombre;
    }

    /**
     * Contructo public para darle nombre y vida maxima
     * @param nombre
     * @param vidaMaxima
     */
    public PokemonBaseImpl(String nombre, int vidaMaxima){
        this.nombre = nombre;
        this.vidaMaxima = vidaMaxima;
    }

    public PokemonBaseImpl(int numeroPokemon){
        this.numeroPokemon = numeroPokemon;
    }

    protected int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int vidaActual) {
        this.vidaActual = vidaActual;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaqueBasico() {
        return ataqueBasico;
    }

    public void setAtaqueBasico(int ataqueBasico) {
        this.ataqueBasico = ataqueBasico;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(int ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public TIPOPokemon getTipo() {
        return tipo;
    }

    public void setTipo(TIPOPokemon tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Soy el pokemon : " + this.numeroPokemon + " tengo " + this.vidaActual + " y soy tipo " + this.tipo;
    }


    public abstract void darGolpeEspecial();

    public boolean estoyVivo(){
        if(vidaActual<=0) {
            this.vivo = false;
            return this.vivo;
        }

        return this.vivo;
    }

    @Override
    public void recibirGolpe(int golpe) {

    }

    @Override
    public void darGolpe(int Golpe) {
        System.out.println(this.ataqueBasico);
    }

    @Override
    public void realizarDefensa() {

    }

    public boolean estaCapturado(){
        return this.capturado;
    }

    public void setCapturado(boolean capturado) {
        this.capturado = capturado;
    }

    public abstract void saludar();

}
