import utilidades.Utils;

public class Iteradores {

    public static void saludoIteradores(){
        System.out.println("Saludo");
    }

    public static void tablaMultiplicar(){

        int numeroMultiplicar =
                Utils.pedirNumeroUsuario("Dame un numero que voy con la tabla de multiplicar");

        if (numeroMultiplicar < 0){
            System.out.println("numero negativo: " + numeroMultiplicar);
        } else if (numeroMultiplicar == 0) {
            System.out.println("numero es igual a cero: " + numeroMultiplicar);
        } else {
            System.out.println("numero positvo: " + numeroMultiplicar);
        }

        System.out.println("La tabla del " + numeroMultiplicar);

        //Condición de salida = 20

        //valor++ = valor = valor + 1
        //valor-- = valor = valor - 1
        for (int i = 0; i < 100; i++) {

            if (i%2 == 0){
                System.out.println("Numeros pares: " + i);
            }else {

            }

        }


        int numeroIteraciones = Utils.pedirNumeroUsuario("Maximo de iteraciones");
        int valorInicial = 0;
        int valorSalto = 1;

        for (int i = valorInicial; i < numeroIteraciones; i = i + valorSalto ) {
            System.out.println("\t"+numeroMultiplicar + " * " + i
                    +"  = " + numeroMultiplicar*i );
        }

        while (valorInicial <= numeroIteraciones){
            System.out.println("\t"+numeroMultiplicar + " * " + valorInicial
                    +"  = " + numeroMultiplicar*valorInicial );
            valorInicial = valorInicial+valorSalto;
        }

        do{
            System.out.println("\t"+numeroMultiplicar + " * " + valorInicial
                    +"  = " + numeroMultiplicar*valorInicial );
            valorInicial = valorInicial+valorSalto;
        }while (valorInicial <= numeroIteraciones);


        /** En un bucle
        System.out.println("\t"+numeroMultiplicar + " * 1=" + numeroMultiplicar*1 );
        System.out.println("\t"+numeroMultiplicar +  " * 2=" + numeroMultiplicar*2 );
        System.out.println("\t"+numeroMultiplicar + " * 3=" + numeroMultiplicar*3 );
        System.out.println("\t"+numeroMultiplicar + " * 4=" + numeroMultiplicar*4 );
        **/
    }

    public static boolean esPrimo(int numeroAEvaluar){

        boolean esPrimo = true;

        for (int i = numeroAEvaluar-1; i > 1 ; i--) {
            System.out.println("Numero evaluar: "+ numeroAEvaluar + "La I: "
                    + i + " resto :" + numeroAEvaluar%i);
            if (numeroAEvaluar%i == 0){
                esPrimo = false;
                break;
            }

        }

        return esPrimo;
    }

}
