package bucles.ejercicios;

import java.util.Scanner;

public class MultiplosHasta100 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Número del que mostrar los múltiplos: ");
            int numero = sc.nextInt();

            if (numero <= 0) {
                System.out.println("El número debe ser mayor que cero.");
                return;
            }

            for (int i = 0; i < 100; i += numero) {
                System.out.println(i);
            }
        }
    }
}
