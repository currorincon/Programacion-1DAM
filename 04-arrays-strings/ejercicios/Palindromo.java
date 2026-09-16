import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduce una cadena: ");
            String texto = sc.nextLine().replace(" ", "").toLowerCase();

            String invertida = new StringBuilder(texto).reverse().toString();
            System.out.println(texto.equals(invertida) ? "Es palíndromo" : "No es palíndromo");
        }
    }
}
