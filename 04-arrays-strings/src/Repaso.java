import utilidades.Utils;

public class Repaso {


    public static void main(String[] args) {

        int nElementos = 6;
        int [] numerosSorteo = new int[nElementos];
        int [] numerosUsuario = new int[numerosSorteo.length];
        int contadorAciertos = 0;

        inicializarNumerosSorteo(numerosSorteo);
        //Utils.mostrarArray(numerosSorteo);
        pedirNumerosUsuario(numerosUsuario);
        //Utils.mostrarArray(numerosUsuario);
        contadorAciertos = comprobarResultados(numerosSorteo, numerosUsuario);
        System.out.println("Numero de Aciertos: " + contadorAciertos);
        calcularPremio(contadorAciertos);


    }

    private static void calcularPremio(int contadorAciertos) {

        switch (contadorAciertos){

            case 0:
                System.out.println("Na de nada");
                break;
            case 1,2,3,4:
                System.out.println("Vaya fracaso. Solo reintegro");
                break;
            case 5:
                System.out.println("80% del premio. Congrats");
                break;
            case 6:
                System.out.println("Premiazooooo");
                break;
            default:
                break;

        }

    }

    private static void pedirNumerosUsuario(int[] arrayUsuario) {

        int numeroUsario =0;

        for (int i = 0; i < arrayUsuario.length; i++) {

            numeroUsario =  Utils.pedirNumeroUsuario("Dame el numero de tu loteria(1,100): ");

            while (estaRepetido(arrayUsuario, numeroUsario)){
                numeroUsario = Utils.pedirNumeroUsuario("Esta Repetido. Dame otro numero de tu loteria (1,100): ");
            }
            arrayUsuario[i] = numeroUsario;

        }
    }

    private static int comprobarResultados(int[] numerosSorteo, int[] numerosUsuario) {

        int numeroAciertos = 0;

        for (int i = 0; i < numerosSorteo.length; i++) {
            for (int j = 0; j < numerosUsuario.length; j++) {

                if( numerosSorteo[i] == numerosUsuario[j]){
                    numeroAciertos++;
                }

            }

        }

        return numeroAciertos;
    }

    private static void inicializarNumerosSorteo(int[] numerosSorteo) {

        int numeroLoteria = 0;

        for (int i = 0; i < numerosSorteo.length; i++) {

          numeroLoteria = Utils.pedirNumeroAleatorio(1,100);

          while (estaRepetido(numerosSorteo, numeroLoteria)){
              numeroLoteria = Utils.pedirNumeroAleatorio(1,100);
          }
          numerosSorteo[i] = numeroLoteria;

        }

    }

    public static boolean estaRepetido(int[] numerosSorteo, int numeroLoteria) {

        boolean repetido = false;

        for (int i = 0; i < numerosSorteo.length; i++) {
            if(numerosSorteo[i] == numeroLoteria){
                repetido = true;
                break;
            }

        }
        return repetido;
    }


}
