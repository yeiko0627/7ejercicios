
package agosto26;

/**
 *
 * @author Yeiner
 */
import java.util.Scanner;

public class DibujarCuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del cuadrado: ");
        int tamano = sc.nextInt();

        // Dibuja el cuadrado
        for (int i = 1; i <= tamano; i++) {
            for (int j = 1; j <= tamano; j++) {
                if (i == 1 || i == tamano || j == 1 || j == tamano) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // Salto de línea para pasar a la siguiente fila
        }

        sc.close();
    }
}
