package utilidades;

public class Matrices {

    public static void main(String[] args) {

        int nCol = 3;
        int nFilas = 3;

        String[] alumnos = {"Ana","Curro","Marta","Rafa","Antonio"};
        String[] modulos = {"PG","BBDD","ED","LM","SOST"};

        //int [][]notas = {{1,2,3,4,5},{3,4,5,7,8},{3,4,5,7,8},{3,4,5,7,8},{3,4,5,7,8}};

        int [][]notas = new int[alumnos.length][modulos.length];

        inicializarMatrix(notas);
        mostrarMatriz(notas, modulos, alumnos);


    }

    /**
     * Metodo para mostrar los valores de una matriz dada
     * @param matriz matriz a mostrar
     */
    private static void mostrarMatriz(int[][] matriz, String[] modulos, String[]alumnos){

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(alumnos[i]);
            for (int j = 0; j < matriz[0].length; j++) {
                //System.out.println("Matriz ["+ i +"]["+ j + "]: " + matriz[i][j]);
                System.out.print(modulos[j]+":" + matriz[i][j] + "\t");
            }
            System.out.println("\n");
        }


    }

    /**
     * Metodo que sirve para inicializar una matriz dada
     * @param matriz matriz a inicializar
     * @author Francisco Rincón
     */
    private static void inicializarMatrix(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    matriz[i][j] = Utils.pedirNumeroAleatorio(1,10);
                }
        }


    }


}
