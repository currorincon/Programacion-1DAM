import utilidades.Utils;

import java.util.Scanner;

public class ExamenPrimitivas {


    public static void main(String[] args) {

//        Crea un programa que pida al usuario dos números enteros (a y b) y calcule:
//● La suma de los números pares comprendidos entre a y b (incluidos si lo son).
//● La suma de los números impares comprendidos entre a y b.
//● Cuántos pares e impares hay en total.
//● Y finalmente, indique con un mensaje qué grupo tiene mayor suma acumulada (“Los
//                pares suman más” o “Los impares suman más”).


        //ejercicio1();
        ejercicio2();
        //ejercicio3();


    }

    private static void ejercicio2() {
        //Palindromo



    }

    private static void ejercicio3() {
    int numeroEvaluar = pedirNumeroUsuario("Dime Numero");
    int producto = 0;

        for (int i = 0; i <= numeroEvaluar; i++) {

            if(i == 3){
                System.out.println("Solo para la i = 3");
                break;
            }

            producto = i*3;
        }


    }

    private static void ejercicio1() {

        int numerosPar = 0, numerosImpar = 0, sumaPar = 0, sumaImpar = 0;
        int numero1 = pedirNumeroUsuario("Dame un numero ");
        int numero2 = pedirNumeroUsuario("Dame un  numero ");

        if(numero1 < numero2){
            int variableAuxiliar = numero2;
            numero2 = numero1;
            numero1 = variableAuxiliar;
        }

        for (int i = numero2; i <= numero1; i++) {
            if (i%2 ==0 ){
//                System.out.println("Es par");
                numerosPar++; //numeroPar = numerosPar + 1;
                sumaPar = sumaPar + i;

            }else {
//                System.out.println("Es impar");
                numerosImpar++;
                sumaImpar = sumaImpar + i;

            }
        }

        System.out.println("Hay " + numerosPar + " " + "pares y la suma de ellos es " + sumaPar + ", " +
                "por otra parte, hay " + numerosImpar + " " + "impares y la suma de ellos es " + sumaImpar);


    }

    public static int pedirNumeroUsuario(String textoInicial){

        System.out.println(textoInicial);

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        return numero;
    }



}
