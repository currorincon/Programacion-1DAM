package utilidades;

import java.util.Scanner;


public class Utils {


    /**
     * Metodo para incialiar un array con numeros aleatorios que el usuario dice el maximo y el minimo
     * @param array array donde se almacenan los numeros
     * @param max maximo de la rango de numeros aleatorios
     * @param min minimo de la rango de numeros aleatorios
     */
    public static void inicializarArrayNumerosAleatorios(int[] array, int max, int min){

        for (int i = 0; i < array.length; i++) {
            array[i] = pedirNumeroAleatorio(min,max);
        }


    }

    /**
     * Metodo para multiplicar un array por un numero determinado por el factor
     * @param array array a multipplicar
     * @param factorMultiplicador factor por el cual se va a multiplicar el array
     */
    public static void multiplicarValorArray(int []array, int factorMultiplicador){

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * factorMultiplicador; // Multiplicar array por el factor
        }

    }


    /**
     * Metodo para mostrar la serie Bifonacci de forma iterativa
     */
    public static void mostrarSerieBifonacci(int nElementos){

       // int nElementos = pedirNumeroUsuario("Dame el numero " +
         //       "de elementos de la serie de Bifonacci");
        int sumaElementos = 0;
        int a = 1,b = 0;

        //Si el usuario pide 0 lementos le digo que no hay serie que mostrar
        if (nElementos == 0){
            System.out.println("No hay elementos en la serie");
        }
        //Si el usuario pide solo un elementos, le muestro1
        if(nElementos == 1){
            System.out.println("\t"+a);
        }


        for (int i = 0; i < nElementos ; i++) {
            sumaElementos = a + b;
            a = b;
            b = sumaElementos;
        }
        System.out.println("Elementos final: "+ sumaElementos);

    }
    /**
     * Metodo para mostrar la serie Bifonacci de forma recursiva
     */
    public static int mostrarSerieBifonacciRecursivamente(int elemento) {
        int resultado = 0;

        if(elemento == 0){
            return 0;
        } else if (elemento == 1) {
            return 1;
        }else {

            resultado = mostrarSerieBifonacciRecursivamente(elemento-2)
                    + mostrarSerieBifonacciRecursivamente(elemento-1) ;

            return resultado;

        }
    }

    /**
     *
     * @param numeroFactorial
     * @return
     */
    public static int resultadoFactorial(int numeroFactorial){

        int factorial = 1;

        for (int i = numeroFactorial; i >= 1  ; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    /**
     *
     * @param numeroFactorial
     * @return
     */
    public static int factorialRecursivo(int numeroFactorial){

        int factorial = 1;

        if(numeroFactorial == 1){
            factorial = 1;
        }else {
            factorial = numeroFactorial * factorialRecursivo(numeroFactorial - 1);
        }
        return factorial;
    }

    /**
     * Metodo para averiguar si un numero es primo o no
     * @param numeroAEvaluar numero que se va a evaluar para averiguar si es primo
     * @return true si es primo, false si no es primo
     */
    public static boolean esPrimo(int numeroAEvaluar){

        boolean esPrimo = true;

        for (int i = numeroAEvaluar-1; i > 1 ; i--) {
            if (numeroAEvaluar%i == 0){
                esPrimo = false;
                break;
            }

        }

        return esPrimo;
    }

    /**
     * Este metodo pide un numero aleatorio y lo devuelve
     * @param minimo rango minimo del numero aleatorio
     * @param maximo rango maximo del numero aleatorio
     * @return el numero aleatorio generado
     */
    public static int pedirNumeroAleatorio(int minimo, int maximo){
        return (int) Math.round( (Math.random()*(maximo-minimo) +minimo));
    }

    /**
     * Breve descripción
     * Otra linea
     * @param textoInicial Para qué es este paramentro
     * @return Qué devuelvo
     */
    public static int pedirNumeroUsuario(String textoInicial){

        System.out.println(textoInicial);

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        return numero;
    }

    /**
     * Metodo para solicitar una cadena/frase al usuario.
     * @param cadenaInicial texto que le va a salir en pantalla al usuario
     * @return la cadena introducida por el usuario
     */
    public static String pedirCadenaUsuario(String cadenaInicial){

        String cadenaUsuario = "";
        System.out.println(cadenaInicial);

        Scanner sc = new Scanner(System.in);

        cadenaUsuario = sc.next(); //Cambiar a nextLine() si da problemas
        return cadenaUsuario;
    }

    /**
     * Metodo para solicitar una cadena/frase al usuario sin mensaje inicial.
     * @return la cadena introducida por el usuario
     */
    public static String pedirCadenaUsuarioSinMensajeInicial(){

        String cadenaUsuario = "";
        Scanner sc = new Scanner(System.in);

        cadenaUsuario = sc.next(); //Cambiar a nextLine() si da problemas
        return cadenaUsuario;
    }

    /**
     *
     * @param textoInicial
     * @param puntosExtra
     */
    public static void pedirNumeroUsuarioSuma10(String textoInicial, int puntosExtra){

        System.out.println(textoInicial);

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        //En esta variable almaceno el numero que me da elusuaior y le sumo los puntos Extra
        int resultadoOperacion = numero + puntosExtra;

        System.out.println("Este numero mas 10: "
                + resultadoOperacion );
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Valor array["+i+"] = "+array[i]);
        }
    }


}
