
package agosto26;

/**
 *
 * @author Yeiner
 */
public class AbecedarioInverso {
    public static void main(String[] args) {
        // Recorre el rango de caracteres Unicode para las letras del alfabeto Z-A
        for (char letra = 'Z'; letra >= 'A'; letra--) {
            // Excluye la letra 'Ñ'
            if (letra != 'Ñ') {
                // Imprime las letras desde la actual hasta 'A'
                for (char letraActual = letra; letraActual >= 'A'; letraActual--) {
                    System.out.print(letraActual + " ");
                }
                System.out.println(); // Salto de línea después de cada fila
            }
        }
    }
}
