package utilidades;

import java.util.Scanner;

public class SumarPrimos {

    public static void main(String[] args){

        int limiteInferior = 0;
        int limiteSuperior = 0;

//        limiteInferior = solicitarNumero("Dame el limite inferior");
//        limiteSuperior = solicitarNumero("Dame el limite superior");
//
//        validarDatos(limiteInferior, limiteSuperior);
//        sumarNumerosPrimos(limiteInferior, limiteSuperior);

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a number: ");

        int number = sc.nextInt();

        luckyNumer(number);
    }

    private static void luckyNumer(int number) {

        int luckyCount = 0;
        int unluckyCount = 0;

        while (number > 0) {

            int numRemove = number % 10;

            if (numRemove == 3 || numRemove == 7 || numRemove == 8 || numRemove == 9) {

                luckyCount++;

            } else {
                unluckyCount++;
            }

            number = (number - numRemove)/10 ;
        }

        if (luckyCount > unluckyCount){

            System.out.println("The number you typed its a lucky number");

        }else if(unluckyCount > luckyCount){

            System.out.println("The number you typed isn't a lucky number");

        }else{

            System.out.println("Thats a draw :(, I cant determine if it lucky or not");

        }

    }

    /**
     * Metodo para sumar los N numero primos que pase el usuario con limiteInferior y Superior
     * @param limiteInferior
     * @param limiteSuperior
     */
    public static void sumarNumerosPrimos(int limiteInferior, int limiteSuperior) {

        int sumaPrimos = 0; //Variable para sumar los numeros primos en el intervalo

        for (int i = limiteInferior; i <= limiteSuperior; i=i+1) {
            if(esPrimo(i) == true){
                System.out.println("Numeros del bucle que son primos: " + i);
                sumaPrimos = sumaPrimos+i;
            }

        }

        System.out.println("La suma total de primos es: " + sumaPrimos);

    }

    private static void validarDatos(int limiteInferior, int limiteSuperior) {

        boolean validacion = true;

        while(validacion){

            if (limiteInferior < limiteSuperior){
                validacion = false;
            } else {
                System.out.println("Variables incorrectas, primero limite inferior");
                limiteInferior = solicitarNumero("Dame el limite inferior");
                limiteSuperior = solicitarNumero("Dame el limite superior");
            }

        }

    }

    /**
     * Metodo para pedir el numero al usuario
     * @param cadena cadena que se mostrara por pantalla
     * @return entero, numero del usuario
     */
    public static int solicitarNumero(String cadena){

        System.out.println(cadena);
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        return numero;
    }

    /**
     * Metodo para evaluar si un numero es primo o no.
     * @param numeroAEvaluar
     * @return True si es primo, false si no es primo
     */
    public static boolean esPrimo(int numeroAEvaluar){

        boolean esPrimo = true;

        for (int i = numeroAEvaluar-1; i > 1 ; i=i-1) {
            if (numeroAEvaluar%i == 0){
                esPrimo = false;
                break;
            }

        }

        return esPrimo;
    }


}
