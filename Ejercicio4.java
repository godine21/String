/**
 * 4. Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas ‘a’,
 *cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre
 *mayúsculas y minúsculas.
 * @author Jose Antonio Perez Godinez
 */
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la frase
        System.out.println("Ingrese una frase:");
        String frase = scanner.nextLine().toLowerCase(); // Convertir la frase a minúsculas

        // Contadores para cada vocal
        int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;

        // Recorrer la frase y contar las vocales
        for (int i = 0; i < frase.length(); i++) {
            char ch = frase.charAt(i);
            if (ch == 'a') {
                countA++;
            } else if (ch == 'e') {
                countE++;
            } else if (ch == 'i') {
                countI++;
            } else if (ch == 'o') {
                countO++;
            } else if (ch == 'u') {
                countU++;
            }
        }

        // Mostrar el recuento de cada vocal
        System.out.println("Cantidad de vocales 'a': " + countA);
        System.out.println("Cantidad de vocales 'e': " + countE);
        System.out.println("Cantidad de vocales 'i': " + countI);
        System.out.println("Cantidad de vocales 'o': " + countO);
        System.out.println("Cantidad de vocales 'u': " + countU);

        scanner.close();
    }
}
