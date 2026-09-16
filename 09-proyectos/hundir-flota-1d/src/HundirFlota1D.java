import utilidades.Utils;

public class HundirFlota1D {


    public static void main(String[] args) {

        int fila = 8;
        int intentos = 0;
        int intentosMaximos = 10;
        boolean hundido = false;

        String []tablero = new String[fila];
        int []arrayTorpedos = new int[intentosMaximos+1];
        int longitudBarco = 4;

        System.out.println("\n\n*********** HUNDIR LA FLOTAAAAA ***********\n\n");

        inicializarTablero(tablero);
        mostrarTablero(tablero);
        ponerBarco(tablero,longitudBarco);
        mostrarTablero(tablero);

        while (intentos < intentosMaximos && !hundido) {
            System.out.println("Intento n: " + intentos);
            dispararTorpedos(tablero, intentos, arrayTorpedos);
            intentos++;
            hundido = comprobarHundido(tablero, longitudBarco);
        }

        if(hundido){
            System.out.println("BOOOOOM BARCO HUNDIDO");
        }else System.out.println("BUUUUUUUUUUUUUUU. Turnos acabados. Sigo vivo");

        mostrarTablero(tablero);


    }

    /**
     * Metodo para comprobar si un barco está hundido o no.
     * Comprobamos si hay un numero de X, igual a la longitud del barco.
     * @param tablero tablero a comprobar
     * @param longitudBarco tamaño del barco
     * @return true si está hundido, false si no está hundi
     */
    private static boolean comprobarHundido(String[] tablero, int longitudBarco) {

        int contadorX= 0;
        boolean hundido = false;

        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i].equals("X") ){
                contadorX++;
            }
        }

        if(contadorX == longitudBarco)
            hundido =true;

        return hundido;

    }

    /**
     * Metodo para disparar al tablero y ver si hundo un barco
     * @param tablero
     */
    private static void dispararTorpedos(String[] tablero, int intentos, int[] arrayTorpedos) {

        int posicionAtacar= 0;

        do{
           posicionAtacar = Utils.pedirNumeroAleatorio(0,tablero.length-1);
        }while(estaRepetido(arrayTorpedos, posicionAtacar));

        arrayTorpedos[intentos] = posicionAtacar;

        System.out.println("Posicion Atacar: " + posicionAtacar);

        if(tablero[posicionAtacar].equals("A")){
            System.out.println("Has dado agua");
        }

        if(tablero[posicionAtacar].equals("B")){
            System.out.println("Has dado barco");
            tablero[posicionAtacar] = "X";
        }


    }

    /**
     * Metodo para comprobar si esta repetido un numero en un array dado
     * @param arrayAComprobar
     * @param posicion
     * @return
     */
    public static boolean estaRepetido(int[] arrayAComprobar, int posicion) {

        boolean repetido = false;

        for (int i = 0; i < arrayAComprobar.length; i++) {
            if(arrayAComprobar[i] == posicion){
                repetido = true;
                break;
            }

        }

        return repetido;
    }

    /**
     *
     * @param tablero
     */
    private static void ponerBarco(String[] tablero, int longitudBarco) {


        int posicionInicial = Utils.pedirNumeroUsuario("Dame la posicion del barco de " + longitudBarco+ " posiciones");;

       while (!posicionCorrecta(tablero, posicionInicial, longitudBarco)){
           posicionInicial = Utils.pedirNumeroUsuario("Dame la posicion del barco de " + longitudBarco+ " posiciones");
       }

        for (int i = posicionInicial-1; i < longitudBarco+posicionInicial-1 ; i++) {
                tablero[i] = "B";
        }

    }

    /**
     *
     * @param posicionInicial
     * @param longitudBarco
     * @return
     */
    private static boolean posicionCorrecta(String[] tablero, int posicionInicial, int longitudBarco) {

        boolean esCorrecta = true;

        if((posicionInicial-1) + longitudBarco > tablero.length){
            System.out.println("Posicion del barco Incorrecta. Supera todos los limites. Vuelva a poner");
            esCorrecta = false;
        }

        return esCorrecta;

    }

    /**
     *
     * @param tablero
     */
    private static void mostrarTablero(String[] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            System.out.print(tablero[i]+ " ");
        }

    }

    /**
     *
     * @param tablero
     */
    private static void inicializarTablero(String[] tablero) {

        for (int i = 0; i < tablero.length; i++) {
            tablero[i] = "A";
        }

    }

}
