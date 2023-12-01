/**
 * 2. Crea un programa que pida dos cadenas de texto por teclado y luego indique si son iguales,
 *además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
 * @author Jose Antonio Perez Godinez
 */
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario dos cadenas de texto
        System.out.print("Ingresa la primera cadena de texto: ");
        String cadena1 = scanner.nextLine();

        System.out.print("Ingresa la segunda cadena de texto: ");
        String cadena2 = scanner.nextLine();

        // Verificar si las cadenas son iguales
        boolean sonIguales = cadena1.equals(cadena2);
        boolean sonIgualesSinConsiderarMayusculas = cadena1.equalsIgnoreCase(cadena2);

        // Mostrar los resultados
        if (sonIguales) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }

        if (sonIgualesSinConsiderarMayusculas) {
            System.out.println("Las cadenas son iguales sin considerar mayúsculas/minúsculas.");
        } else {
            System.out.println("Las cadenas son diferentes sin considerar mayúsculas/minúsculas.");
        }

        scanner.close();
    }
}

