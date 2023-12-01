/**
 * 5. Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo o
 *no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas). Supondremos que
 *el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni acentos, etc.). Un
 *palíndromo es un texto que se lee igual de izquierda a derecha que de derecha a izquierda.
 * @author Jose Antonio Perez Godinez
 */
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese una frase
        System.out.println("Ingrese una frase para verificar si es un palíndromo:");
        String frase = scanner.nextLine().toLowerCase().replaceAll("\\s", ""); // Convertir a minúsculas y quitar espacios

        // Verificar si la frase es un palíndromo
        boolean esPalindromo = verificarPalindromo(frase);

        // Mostrar el resultado
        if (esPalindromo) {
            System.out.println("La frase ingresada es un palíndromo.");
        } else {
            System.out.println("La frase ingresada NO es un palíndromo.");
        }

        scanner.close();
    }

    public static boolean verificarPalindromo(String frase) {
        int longitud = frase.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (frase.charAt(i) != frase.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
