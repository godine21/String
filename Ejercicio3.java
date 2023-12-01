/**
 * 3. Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos. Luego
 *mostrará un código de usuario (en mayúsculas) formado por la concatenación de las tres
 *primeras letras de cada uno de ellos.
 * @author Jose Antonio Perez Godinez
 */
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el nombre y los apellidos
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su primer apellido:");
        String apellido1 = scanner.nextLine();

        System.out.println("Ingrese su segundo apellido:");
        String apellido2 = scanner.nextLine();

        // Obtener las tres primeras letras de cada cadena (nombre y apellidos)
        String codigoUsuario = obtenerCodigoUsuario(nombre, apellido1, apellido2);

        // Mostrar el código de usuario en mayúsculas
        System.out.println("El código de usuario es: " + codigoUsuario.toUpperCase());

        scanner.close();
    }

    public static String obtenerCodigoUsuario(String nombre, String apellido1, String apellido2) {
        // Obtener las tres primeras letras de cada cadena y concatenarlas
        String codigo = nombre.substring(0, Math.min(nombre.length(), 3)) +
                        apellido1.substring(0, Math.min(apellido1.length(), 3)) +
                        apellido2.substring(0, Math.min(apellido2.length(), 3));
        return codigo;
    }
}
