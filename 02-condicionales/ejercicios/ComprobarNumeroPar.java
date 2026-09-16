import java.util.Scanner;

public class ComprobarNumeroPar {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduzca un número: ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                System.out.println("El número es par");
            } else {
                System.out.println("El número es impar");
            }
        }
    }
}
