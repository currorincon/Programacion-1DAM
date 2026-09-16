import utilidades.Utils;

public class TresEnRaya {


    public static void inicializarTablero(){

        int nFilas = 3;
        int nCol = 3;

        boolean ganador = false;
        //Variable para ver el turno
        //  0 -> turno maquina
        //  1 -> turno humano
        int turno = Utils.pedirNumeroAleatorio(0,1);


        //El 0 son las fichas de la maquina y el 1 fichas del humano
        int[][] matriz = new int[nFilas][nCol];
        inicializarMatriz(matriz);

        while(!ganador) {
            ponerFicha(matriz, turno);
            verTablero(matriz, turno);
            ganador = comprobarGanador(matriz);
            if(ganador){
                System.out.println("HAY GANADOOOOR");
            }
            turno = cambiaTurno(turno);
        }

    }

    private static int cambiaTurno(int turno) {

        if(turno == 0){
            turno =1 ;
        }else turno = 0;

        return turno;
    }

    private static void inicializarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = 2;
            }
        }
    }

    private static boolean comprobarGanador(int[][] matriz) {

        boolean ganador = false;
        int casillaHumano = 1;
        int casillaMaquina = 0;

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] == matriz[i][1] && matriz[i][0] == matriz[i][2] && matriz[i][0] != 2) {
                ganador = true;
            }
        }

        for (int j = 0; j < matriz.length; j++) {
            if (matriz[0][j] == matriz[1][j] && matriz[0][j] == matriz[2][j] && matriz[0][j] != 2) {
                ganador = true;
            }
        }

        //comprobamos diagonales, tanto directa como inversa
       if(matriz[0][0] == matriz[1][1] && matriz[0][0] == matriz[2][2] && matriz[0][0] != 2){
           ganador = true;
       }

        if(matriz[0][2] == matriz[1][1] && matriz[0][2] == matriz[2][0] && matriz[0][2] != 2){
            ganador = true;
        }


        return ganador;
    }

    private static void verTablero(int[][] matriz, int turno) {

        System.out.println("Es el turno de :");
        if(turno == 0){
            System.out.print("Maquina");
        }else System.out.print("Humano");

        System.out.println("\n");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                //System.out.println("Matriz ["+ i +"]["+ j + "]: " + matriz[i][j]);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("\n");
        }

    }

    /**
     * Metodo para poner la ficha en el tablero según el turno que sea.
     * @param matriz las fichas 0 son maquina y las fichas 1 son humano
     * @param turno turno para maquina igual a 0, turno humano igual a 1
     */
    private static void ponerFicha(int[][] matriz, int turno) {

        //El 0 son las fichas de la maquina y el 1 fichas del humano
        int fila = 0, columna = 0;
        boolean casillaValida = false;

        if(turno == 0 ){

            do{
                fila = Utils.pedirNumeroAleatorio(0,2);
                columna = Utils.pedirNumeroAleatorio(0,2);
                casillaValida = comprobarCasillaValida(matriz, fila, columna);
                if (casillaValida) {
                    matriz[fila][columna] = 0;
                    break;
                }
            }while (!casillaValida);


        }else{
            System.out.println("En que casilla quieres ponerla.");

            do {
                fila = Utils.pedirNumeroUsuario("Dame la i:");
                columna = Utils.pedirNumeroUsuario("Dame la j:");
                casillaValida = comprobarCasillaValida(matriz, fila, columna);
                if (casillaValida) {
                    matriz[fila][columna] = 1;
                    break;
                }else {
                    System.out.println("Casilla invalida, porfa piensa otra.");
                }
            }while (!casillaValida);
        }

    }

    private static boolean comprobarCasillaValida(int[][] matriz, int fila, int columna) {

        if (matriz[fila][columna] == 2){
            return true;
        }else {
            return false;
        }

    }

}
