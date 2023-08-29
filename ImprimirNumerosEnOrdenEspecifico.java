
package agosto26;

/**
 *
 * @author Yeiner
 */
import java.util.Scanner;

public class ImprimirNumerosEnOrdenEspecifico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10]; // Creamos un arreglo para almacenar los números

        System.out.println("Ingresa 10 números:");

        // Leer los números y almacenarlos en el arreglo
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Imprimir los números en el orden especificado
        System.out.println("El primer número es: " + numeros[0]);
        System.out.println("El último número es: " + numeros[9]);
        System.out.println("El segundo número es: " + numeros[1]);
        System.out.println("El penúltimo número es: " + numeros[8]);
        System.out.println("El tercer número es: " + numeros[2]);

        sc.close();
    }
}

