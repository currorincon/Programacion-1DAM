import objetos.Animal;
import objetos.Granja;
import objetos.Persona;


import utilidades.Utils;
import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {

        Granja granja1 = new Granja();
        granja1.inicializarAnimales();
        granja1.verAnimales();
        granja1.setearDatos();
        granja1.verAnimales();

        int [] array  = new int[10];

        Granja [] covap = new Granja[50];

        for (int i = 0; i < covap.length; i++) {
            covap[i] = new Granja();
            covap[i].setHectareas(Utils.pedirNumeroAleatorio(20,150));
        }


//        Persona persona1 = new Persona("Curro", 38, 174, "89898989X");
//        persona1.decirHola();
//
//        Persona persona2 = new Persona("Marcos", 18, 170, "87878787L");
////        persona2.decirEdad();
////        System.out.println(persona2);
////        System.out.println(persona2.hashCode());
////        System.out.println(persona2.getClass());
//        Persona persona3 = new Persona("Adrian", 18, 190, "23232323L");
//
//
//        System.out.println(persona2 == persona3);
//        System.out.println(persona2.equals(persona3));
//

        //TresEnRaya.inicializarTablero();

       // ejercicio1();
      //  ejercicio2();

//
//        int longitudArray = 5;
//        int factor = 10;
//
//        int []array = new int[longitudArray];
//
//        //paso valor y paso referencia
//        int max = Utils.pedirNumeroUsuario("Dame el maximo del array");
//        int min = Utils.pedirNumeroUsuario("Dame el mínimo del array");
//
//        Utils.inicializarArrayNumerosAleatorios(array,max,min);
//        Utils.mostrarArray(array);
//        Utils.multiplicarValorArray(array,factor);
//        Utils.mostrarArray(array);
//
//
//


        //
//         Utils.pedirNumeroUsuario("Dame un numero");
//
//         calcularTiempo();

//
//        int resultado =  Utils.mostrarSerieBifonacciRecursivamente(7);
//        System.out.println("El resultado es: " + resultado);


//      //  Iteradores.saludoIteradores();
//      //  Iteradores.tablaMultiplicar();
//        int numeroEvaluar = Utils.pedirNumeroUsuario("Dime numero a evaluar");
//
//        boolean esPrimo = Utils.esPrimo(numeroEvaluar);
//
//        if(esPrimo){
//            System.out.println("Tu numero es primo");
//        }else {
//            System.out.println("Tu numero NO es primo");
//        }

        int numeroDePrimos = 0;
//        int numeroMaximoPrimos = Utils.pedirNumeroUsuario("Dame el limite de primos que quieres saber");
//        int numeroMinimoPrimos = Utils.pedirNumeroUsuario("Dame el minimo de primos que quieres saber");

//        for (int i = numeroMinimoPrimos ; numeroDePrimos < numeroMaximoPrimos; i++) { // 1 - 99
//            if(Utils.esPrimo(i) ){
//                System.out.println("El numero: " + i + " es primo: "+ Utils.esPrimo(i));
//                numeroDePrimos = numeroDePrimos + 1; //numeroDePrimos ++;
//            }
//        }
//        System.out.println("Hay "+ numeroDePrimos + " numero de primos");

//        int contador = 0;
//
//        while( numeroDePrimos < numeroMaximoPrimos){
//            if(Utils.esPrimo(numeroMinimoPrimos) ){
//                System.out.println("El numero: " + numeroMinimoPrimos + " es primo: "+ Utils.esPrimo(numeroMinimoPrimos));
//                numeroDePrimos = numeroDePrimos + 1; //numeroDePrimos ++;
//            }
//            numeroMinimoPrimos++;
//        }
//        System.out.println("Hay "+ numeroDePrimos + " numero de primos");

//        long startTimeB = System.nanoTime();
//        int factorial =  Utils.resultadoFactorial(10);
//        System.out.println("El resultado final bucle es: " + factorial);
//
//        long endTimeB = System.nanoTime() - startTimeB; // tiempo en que se ejecuta su for
//
//        System.out.println("Tiempo empleado para bucle : " + endTimeB);
//
//
//       long startTime = System.nanoTime();
//       int factorial2 =  Utils.factorialRecursivo(10);
//        System.out.println("El resultado final en Recursivo es: " + factorial2);
//
//        long endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su for
//
//       System.out.println("Tiempo empleado para recursivo : " + endTime);
//

//       // pedirNotas();
//
//        //llamada primera
//        String opcion = solicitarCompra();
//        int descuento = aplicarDescuento(opcion);
//        //int cantidadRopa = preguntarCantidad(opcion);
//        int cantidadRopa = preguntarCantidadSinOpcion();
//        calcularFactura(descuento, cantidadRopa);
    }

    private static void calcularTiempo(){

        long tiempoInicial = System.nanoTime();
        Utils.resultadoFactorial(225);
        long tiempoFinal = System.nanoTime() - tiempoInicial;
        System.out.println("El tiempo empleado ITERATIVAMENTE es: " + tiempoFinal);

        long tiempoInicialRecursivo = System.nanoTime();
        Utils.factorialRecursivo(225);
        long tiempoFinalRecursivo = System.nanoTime() - tiempoInicialRecursivo;
        System.out.println("El tiempo empleado RECURSIVAMENTE es: " + tiempoFinalRecursivo);


    }

    private static int preguntarCantidadSinOpcion() {
        return Utils.pedirNumeroUsuario("Cuantos quieres?");
    }

    private static int preguntarCantidad(String opcion) {

        int cantidad = 0;

        switch (opcion){
            case "Jerseys","1":
                cantidad = Utils.pedirNumeroUsuario("Introduzca la cantidad " +
                        "de Jerseys que desea comprar");
                break;
            case "Calzado","2":
                cantidad = Utils.pedirNumeroUsuario("Introduzca la cantidad " +
                        "de Calazado que desea comprar");
                break;
            case "Complementos","3":
                cantidad = Utils.pedirNumeroUsuario("Introduzca la cantidad " +
                        "de Complementos que desea comprar");
                break;
            default:
                System.out.println("No hay descuento para esa elección");
        }
        return cantidad;
    }

    private static void calcularFactura(int descuento, int cantidad) {

        int valorProducto = 100;
        int facturaTotal = valorProducto*cantidad - (cantidad*valorProducto *(descuento)) /100;

        System.out.println("Total factura:\n\t");

        if(facturaTotal > 100){
            facturaTotal = facturaTotal -10;
            System.out.println("Enhorabuena son mas de 100, tiene 10€ de descuento"
                    + facturaTotal
                    + " este es el total");
        }else{
            System.out.println("Precio final: " + facturaTotal);
        }


    }

    private static int aplicarDescuento(String opcion) {

        //Variable para guardar el descuento según selección
        int descuento = 0;

        char letra = opcion.charAt(2);

        switch (opcion){
            case "Jerseys","1":
                descuento = 10;
                break;
            case "Calzado","2":
                descuento = 15;
                break;
            case "Complementos","3":
                descuento = 20;
                break;
            default:
                System.out.println("No hay descuento para esa elección");
        }

        return descuento;
    }

    private static String solicitarCompra() {

        System.out.println("Buenas, por favor, introduzca el tipo " +
                "de ropa que va a comprar:\n\t1.Jerseys\n\t2.Calzado\n\t3.Complementos");

        String opcion = Utils.pedirCadenaUsuarioSinMensajeInicial();

        return opcion;


    }

    private static void decidirSupenso(float notaMedia) {


    }


    private static void pedirNotas(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Buenas, introduce la nota 1: ");
        float nota1 = sc.nextFloat();
        System.out.println("Buenas, introduce la nota 2: ");
        float nota2 = sc.nextFloat();
        System.out.println("Buenas, introduce la nota 3: ");
        float nota3 = sc.nextFloat();

        float notaMedia = calcularNotaMedia(nota1,nota2,nota3);

        decidirSupenso(notaMedia);

    }


    private static float calcularNotaMedia(float nota1, float nota2, float nota3){

        float notaMedia = 0;


        notaMedia =  (nota1 + nota2 + nota3 ) / 3;
        System.out.println("Nota Media: " + notaMedia);
        return notaMedia;

    }

}
