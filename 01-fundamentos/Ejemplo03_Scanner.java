package fundamentos;

import java.util.Scanner;

public class Ejemplo03_Scanner {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Dame un número entero: ");
            int numero = sc.nextInt();
            System.out.println("Has introducido: " + numero);
        }
    }
}
