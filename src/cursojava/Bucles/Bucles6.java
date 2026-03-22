package cursojava.Bucles;

/**
 * Diseñar un programa que muestre el producto de los 10 primeros numeros
 * impares
 */
public class Bucles6 {

    public static void main(String[] args) {

        long producto = 1;

        for (int i = 1; i <= 19; i++) {
            if (i % 2 != 0) {
                producto *= i;
            }
        }

        System.out.println("El producto de los numeros es de: " + producto);
    }
}
