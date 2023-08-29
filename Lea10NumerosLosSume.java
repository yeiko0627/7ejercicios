package agosto26;

/**
 *
 * @author Yeiner
 */
import java.util.Scanner;

public class Lea10NumerosLosSume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0.0;

        System.out.println("Ingresa 10 números:");

        for (int i = 0; i < 10; i++) {
            try {
                System.out.print("Número " + (i + 1) + ": ");
                double numero = sc.nextDouble();
                suma += numero;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Ingresa un número válido.");
                sc.next(); // Limpiar el búfer de entrada
                i--; // Volver a pedir el mismo número
            }
        }

        System.out.println("La suma de los 10 números es: " + suma);

        sc.close(); // Cerrar el escáner cuando ya no se necesite
    }
}
