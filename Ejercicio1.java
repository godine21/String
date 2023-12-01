/**
 * 1. Crea un programa que pida una cadena de texto por teclado y luego muestre cada palabra
 *de la cadena en una línea distinta.
 * @author Jose Antonio Perez Godinez
 */
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario una cadena de texto
        System.out.print("Ingresa una cadena de texto: ");
        String cadena = scanner.nextLine();

        // Dividir la cadena en palabras utilizando split()
        String[] palabras = cadena.split(" ");

        // Mostrar cada palabra en una línea distinta
        System.out.println("Las palabras en la cadena son:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        scanner.close();
    }
}
