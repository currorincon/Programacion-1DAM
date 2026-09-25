package utilidades;

import java.util.Scanner;

public class ejercicioSumaPrimos {

    public static void main(String[] args) {

        /**Codigo
         *
         * Debéis sumar los n numeros primos que haya entre dos numeros
         * que elija el usuario
         *
         *
         * Usuario: 3 y el 11 la suma de todos los primos
         * consola: Los primos son: 3 5 7 11
         *          La suma total es: 26
         *
         * Si el usario mete un primo superior al segundo mostrar mensaje alerta y volver a preguntar
         *
         * Usuario: 11 y 3
         * Consola: Error. No puedo calcular. Vuelva a introducir los primos.
         * Recuerde el primo más pequeño primero
         * Consola: Dime los primos para sumarlos
         * Consola: 3
         * Consola: 7
         * Consola: Los primos...
         */

        int n1 = pedir_numero("Introduce el mínimo: ");
        int n2 = pedir_numero("Introduce el máximo: ");

        if(n2<n1){
            System.out.println("El valor máximo no puede ser menor que el mínimo.");
            System.exit(0);
        }

        sumar_primos(n1, n2);

    }

    //suma los primos entre dos límites dados
    public static void sumar_primos(int num1, int num2){

        //límites inferior y superior
        int n1 = num1;
        int n2 = num2;

        //acumula el valor de la suma
        int suma_primos = 0;

        int aux = n2;

        boolean isPrime = true;
        System.out.println("Números primos entre los valores dados: ");

        //recorre los números entre los límites
        for (int i = 1; i<n2; i++){
            int n = n1;
            if(n%i == 0){
                isPrime = false;
                n++;
            }
            while(isPrime){
                System.out.print(n + " ");
            }
        }


        //imprime el resultado final
        System.out.println("");
        System.out.println("Suma total de los números primos: " + suma_primos);
    }

    //pide un número al usuario y lo devuelve
    public static int pedir_numero(String texto){

        System.out.println(texto);
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }


}
