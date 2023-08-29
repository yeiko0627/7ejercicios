
package agosto26;

/**
 *
 * @author Yeiner
 */
import java.util.Scanner;

public class ContarParesNegativosCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pares = 0;
        int negativos = 0;
        int ceros = 0;

        System.out.println("Ingresa 20 números:");

        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = sc.nextInt();

            // Verificar si el número es par
            if (numero % 2 == 0) {
                pares++;
            }

            // Verificar si el número es negativo
            if (numero < 0) {
                negativos++;
            }

            // Verificar si el número es cero
            if (numero == 0) {
                ceros++;
            }
        }

        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);

        sc.close();
    }
}

