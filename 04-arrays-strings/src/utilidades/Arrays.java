package utilidades;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {


//        double tiempoInicial = System.nanoTime();
//        primeroMetodoOrdenacion();
//        double tiempoFinal = System.nanoTime() - tiempoInicial;
//        System.out.println("Tiempo empleado para el primero: " + tiempoFinal);
////        segundoMetodoOrdenacion();
//
//        tiempoInicial = System.nanoTime();
//        tercerMetodoOrdenacion();
//        tiempoFinal = System.nanoTime() - tiempoInicial;
//        System.out.println("Tiempo empleado para el tercero: " + tiempoFinal);


//        int numeroAEvaluar = Utils.pedirNumeroUsuario("Dime que numero quieres que evaluue");
//        esPalindormo(numeroAEvaluar);

        int nAlumnos = 5;
        double []notas = new double[nAlumnos];
        String[] alumnos = {"Ana","Curro","Marta","Rafa","Antonio"};

        pedirNotas(nAlumnos, notas ,alumnos);
        verNotas(notas, alumnos);
        mostrarNotaMasAlta(notas);
        calcularMedia(notas);
        cuentaSuspensos(notas);
        regaloNavidad(notas);

    }

    private static void regaloNavidad(double[] notas) {

        int alumnoAleatorio = Utils.pedirNumeroAleatorio(0,4);

        for (int i = 0; i < notas.length; i++) {
            if(alumnoAleatorio == i){
                notas[i] = notas[i]*2;
                System.out.println("Enhorabuena, el alumno " + i+1 + " ha optenido un x2 = "+ notas[i]);
                break;
            }
        }
    }

    private static void cuentaSuspensos(double[] notas) {

        int contadorSuspensos = 0;

        for (int i = 0; i < notas.length; i++) {
           if(notas[i] < 5){
               System.out.println("El alumno " + i + "está suspenso");
               contadorSuspensos++;
           }
        }

        System.out.println("Hay "+ contadorSuspensos+ " alumnos suspensos" );
    }

    private static void calcularMedia(double[] notas) {

        double notaMedia = 0;
        double sumaNota = 0;

        for (int i = 0; i < notas.length; i++) {
            sumaNota = sumaNota + notas[i];
        }

        notaMedia = sumaNota/notas.length;
        System.out.println("La nota media es: " + notaMedia);
    }

    private static void mostrarNotaMasAlta(double[] notas) {

        double notaMasAlta = 0;

        for (int i = 0; i < notas.length; i++) {

            if( notas[i] > notaMasAlta){
                notaMasAlta = notas[i];
            }
        }
        System.out.println("La nota más alta es: " + notaMasAlta);

    }

    private static void verNotas(double[] notas, String []alumnos) {

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota de "+ alumnos[i] + ": " + notas[i]);
        }

    }

    private static void pedirNotas(int numeroAlumnos, double []notas, String []alumnos){

        for (int i = 0; i < numeroAlumnos ; i++) {
           notas[i] = Utils.pedirNumeroUsuario("Dame la nota del alumno " + alumnos[i] );
        }

    }

    /**
     * Metodo para evaluar si un numero es palindromo usando arrays
     * @param numeroAEvaluar numero que se evaluado
     */
    private static void esPalindormo(int numeroAEvaluar) {

        int numeroCifras = 4;

        System.out.println("Numero cifras " + numeroCifras);

        int []arraysCifras = new int[numeroCifras];

        for (int i = 0; i < numeroCifras; i++) {
            arraysCifras[i] = numeroAEvaluar/(int) Math.pow(10,numeroCifras-i-1);
            //numeroAEvaluar = numeroAEvaluar%(int) Math.pow(10,numeroCifras-i-1);
            numeroAEvaluar = numeroAEvaluar - arraysCifras[i] * (int) Math.pow(10,numeroCifras-i-1);
            System.out.println("Array["+i +"] = "+ arraysCifras[i] + "nuevoNumero a evaluar " + numeroAEvaluar);

        }

        int indiceArrayAuxiliar = 0;
        boolean esPalindromo = true;

        while(indiceArrayAuxiliar < numeroCifras -1-indiceArrayAuxiliar){

            if(arraysCifras[indiceArrayAuxiliar] != arraysCifras[numeroCifras -1-indiceArrayAuxiliar]){
                esPalindromo = false;
                break;
            }

            indiceArrayAuxiliar++;

        }

        if(esPalindromo){
            System.out.println("El numero es palindromo");
        }else {
            System.out.println("El numero NO es palindromo");
        }


    }

    private static void tercerMetodoOrdenacion() {

       // int array [] = new int [] {3,2,1};
        int array[] = new int[1000];
        int arrayOrdenado[] = new int[array.length];
        boolean estaOrdenado=false;

        for (int i = 0; i < array.length; i++) {
            array[i] = Utils.pedirNumeroAleatorio(1,10);
        }


        double tiempoInicial = System.nanoTime();

        Utils.mostrarArray(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++){
                if(array[i] > array[j]){
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }

        }

        System.out.println("El array 'ordenado'");
        Utils.mostrarArray(array);

    }

    private static void segundoMetodoOrdenacion() {

        int longitudArray = Utils.pedirNumeroUsuario("Dame la longitud del array");
        int array[] = new int[longitudArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = Utils.pedirNumeroAleatorio(1,10);
        }

        boolean estaOrdenado = true;
        int aux = 0;

        while (estaOrdenado){
            for (int i = array.length-1; i > 0; i--) {
                if (array[i] < array[i-1]) {
                    aux = array[i];
                    array[i] = array[i-1];
                    array[i-1] = aux;
                    estaOrdenado = false;
                }else estaOrdenado = false;
            }


        }


    }

    private static void primeroMetodoOrdenacion() {

        int array[] = new int[1000];
        int arrayOrdenado[] = new int[array.length];
        boolean estaOrdenado=false;

        for (int i = 0; i < array.length; i++) {
            array[i] = Utils.pedirNumeroAleatorio(1,10);
        }


        Utils.mostrarArray(array);
        while(!estaOrdenado){
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    int aux = array[i];
                    array[i] = array[i+1];
                    array[i+1] = aux;
                    estaOrdenado = false;
                }
            }

            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]){
                    estaOrdenado = false;
                    break;
                }else estaOrdenado = true;
            }

        }


        System.out.println("El array 'ordenado'");
        Utils.mostrarArray(array);


    }

}
